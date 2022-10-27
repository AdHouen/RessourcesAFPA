package vol1examples.text.Format;

import java.text.*;

class PhoneNumberFormat extends Format implements Cloneable {
    // Constructor.
    public PhoneNumberFormat() {
    }

    // Prefix/Suffix setters and setters.
    public String getAreacodePrefix () {
        return areacodePrefix;
    }
    public void setAreacodePrefix (String newValue) {
        areacodePrefix = newValue;
    }
    public String getAreacodeSuffix () {
        return areacodeSuffix;
    }
    public void setAreacodeSuffix (String newValue) {
        areacodeSuffix = newValue;
    }

    // Signifies the position of the local part 
    // of a formatted phone number should be returned.
    public static final int LOCALNUMBER_FIELD = 0;

    // Signifies that the position of the area 
    // code part of a formatted phone number should be returned.
    public static final int AREACODE_FIELD = 1;

    // Implementation of the required format method.
    public final StringBuffer format(Object number,
                                     StringBuffer toAppendTo,
                                     FieldPosition pos) {
        if (number instanceof Long) {
            return format((Long)number);
        }
        else {
            throw new IllegalArgumentException("Cannot format " + 
                                           " given Object as a Number");
        }
    }

    // Format the phone number.
    public final StringBuffer format(Long phonenumber) {
        StringBuffer pnString = new StringBuffer(phonenumber.toString());

        // Start from the right end inserting characters.

        // Insert hyphen into local phone number.
        pnString.insert(6, "-");

        // Insert space between area code and phone number.
        pnString.insert(3, " ");

        // Insert area code prefix/suffix.
        pnString.insert(3, getAreacodeSuffix());
        pnString.insert(0, getAreacodePrefix());
        
        return pnString;
    }

    // The required parseObject method.
    public final Object parseObject(String source,
                                    ParsePosition parsePosition) {
        return parse(source, parsePosition);
    }

    // Convenience parse method that returns a Long.
    public Long parse(String text) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        Long phonenumber;

        phonenumber = (Long)parse(text, parsePosition);
        if (parsePosition.getIndex() == 0) {
            throw new ParseException("Unparseable number: \"" + text + "\"", 0);
        }
        return phonenumber;
    }

    // Convenience parse method that returns a Number.
    public Number parse(String text, ParsePosition status) {
        int start = status.getIndex();

        // Check for areacodePrefix in text.
        boolean gotAreacode = text.regionMatches(start, areacodePrefix, 0,
                                                 areacodePrefix.length());

        // Advance the start point past the prefix if it exists.
        if (gotAreacode) {
            start += areacodePrefix.length();
        }
        else return null;

        Long longResult = new Long(0);
        StringBuffer stringResult = new StringBuffer("");

        for (;start < text.length(); ++start) {

            // Get the first character.
            char ch = text.charAt(start);

            // Convert ch to a character object.
            Character chObj = new Character(ch);

            // If the character is a digit, add it to result.
            if (Character.isDigit(ch)) {
                stringResult.append(ch);
            }
        }

        longResult = new Long(stringResult.toString());

 
        // Reset the index.
        if (gotAreacode) {
            status.setIndex(start + areacodeSuffix.length()); 
        }

        // Return final value.
        return (Number)longResult;
    }

    // Overrides hashCode
    public int hashCode() {
        return (((new Integer(areacodePrefix)).intValue() * 37 
               + (new Integer(areacodeSuffix)).intValue()));
    }

    // Overrides equals
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
                PhoneNumberFormat other = (PhoneNumberFormat) obj;
                return (areacodePrefix == other.areacodePrefix
                && areacodeSuffix == other.areacodeSuffix);
    }

    // Overrides Cloneable
    public Object clone() {
        PhoneNumberFormat other = (PhoneNumberFormat) super.clone();
        return other;
    }

    // Private constants used by equals() and hashcode()

    private String  areacodePrefix = "";
    private String  areacodeSuffix = "";
}

class Main {
    // Parse and print the phone number string.
    public static void printParse(PhoneNumberFormat pnf, String pnString) {
        System.out.println("Phone number to parse: " + pnString);

        // Parse inside a try block.
        try {
            System.out.println("Phone number as Long:  " + pnf.parse(pnString));
        } catch (ParseException pe) {
            System.out.println("Could not parse number " + pnString + 
                     " with given area code prefix '" + 
                     pnf.getAreacodePrefix() + "'");
        }
        // Print blank line.
        System.out.println("");
    }

    public static void main(String args[]) {
        // Create the phone number format and set its prefix/suffix.
        PhoneNumberFormat pnf = new PhoneNumberFormat();
        pnf.setAreacodePrefix("(");
        pnf.setAreacodeSuffix(")");

        // Parse two example strings to Longs.
        printParse(pnf, "(415) 856-3565");              // 4158563565
        printParse(pnf, "8563565");                     // Properly thows 
                                                        // parse exception.

        // Format a Long to a string.
        Long pnLong = new Long(4158563565l);
        System.out.println("Number to format: " + pnLong);
        System.out.println("Formatted number: " 
                            + pnf.format(pnLong));      // (415) 856-3565
    }
}
