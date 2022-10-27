import java.text.*;
import java.io.*;
import java.util.*;

class Main {

    // Create a parse position object for tracking the parse.
    static ParsePosition parsePos = new ParsePosition(0);

    // Create a number format.
    static NumberFormat numForm = NumberFormat.getInstance();

    Main (String str) {
        // Print out original text.
        System.out.println(str);

        // Parse through text for numbers.
        System.out.println("Found all decimals numbers in the above text:");
        parseNum(str);
    }

    static void parseNum(String str) {
        int beginParseIndex;
        int endParseIndex;
        int intLength;
        Number num = null;

        while (parsePos.getIndex() < str.length()) {

            beginParseIndex = parsePos.getIndex();

            // Parse the string starting at parsePos for a number.
            num = numForm.parse(str, parsePos);

            endParseIndex = parsePos.getIndex();

            if (num != null) {

                // Count length of integer portion for printing spaces.
                intLength = 
                    ((new Integer(beginParseIndex)).toString()).length();

                System.out.print("Index: ");
                printSpaces(4 - intLength);
                System.out.print(beginParseIndex + "  ");

                // Count length of integer portion for printing spaces.
                intLength = countIntLength(numForm, num);

                System.out.print("  Number: ");
                printSpaces(7 - intLength);

                // Format the output so the column aligns.
                System.out.println(numForm.format(num));
            }
            parsePos.setIndex(endParseIndex + 1);
        }
        // Reset parse position to 0 for next loop.
        parsePos.setIndex(0);
    }

    // Count length of integer portion of number.
    static int countIntLength (NumberFormat numForm, Number num) {
        FieldPosition fp = new FieldPosition(NumberFormat.INTEGER_FIELD);
        StringBuffer strBuf = new StringBuffer("");
        long lg = num.longValue();
        numForm.format(lg, strBuf, fp);
        return (fp.getEndIndex() - fp.getBeginIndex());
    }

    // Print spaces.
    static void printSpaces(int count) {
        for (int p = 0; p < count; ++p) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {

        // Accept an input text file
        if (args.length != 1) {
            System.err.println("This program parses text for numbers");
            System.err.println("Usage: java Main <filename>");
            System.exit(1);
        }
        try {
            // Read the text into a buffered reader
            // with '\n' for newlines
            BufferedReader rd = new BufferedReader(new FileReader(args[0]));
            String line;
            StringBuffer sbuf = new StringBuffer();

            while ((line = rd.readLine()) != null) {
                sbuf.append(line);
                sbuf.append('\n');
            }
            rd.close();

            // Call the constructor Main with the input string
            new Main(new String(sbuf));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
