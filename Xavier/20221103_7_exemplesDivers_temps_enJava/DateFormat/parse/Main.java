import java.text.*;
import java.io.*;
import java.util.*;

class Main {
    // Create a date format.
    static DateFormat dateForm = DateFormat.getDateInstance(DateFormat.SHORT);

    // Create a parse position object for tracking the parse.
    static ParsePosition parsePos = new ParsePosition(0);

    Main (String str) {
        // Print out original text.
        System.out.println(str);

        // Parse through text for short dates.
        System.out.println("Finding all short dates in the above text:");
        parseDate(str);
    }

    static void parseDate(String str) {
        int beginParseIndex;
        int endParseIndex;
        int intLength;
        Date d = null;
        dateForm.setLenient(false);

        while (parsePos.getIndex() < str.length()) {
            beginParseIndex = parsePos.getIndex();

            // Parse the string for a date starting at parsePos.
            d = dateForm.parse(str, parsePos);

            endParseIndex = parsePos.getIndex();

            if (d != null) {
                // Count length of index for printing spaces.
                intLength =
                    ((new Integer(beginParseIndex)).toString()).length();
                System.out.print("Index: ");
                printSpaces(4 - intLength);
                System.out.print(beginParseIndex);
                printSpaces(4);

                // Count length of date for printing spaces.
                System.out.print("Number: ");
                printSpaces(10 - dateForm.format(d).length());
                System.out.println(dateForm.format(d));
            }
            parsePos.setIndex(endParseIndex + 1);
        }
        // Reset parse position to 0 for next loop.
        parsePos.setIndex(0);
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
            System.err.println("This program parses text for dates");
            System.err.println("Usage: java Main input.txt");
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
