import java.text.*;
import java.io.*;
import java.util.*;

class Main {

     // Create a parse position object for tracking the parse.
     static ParsePosition parsePos = new ParsePosition(0);

     // Create a number format.
     static NumberFormat decimalForm  = NumberFormat.getInstance();


    Main (String str) {
        // Print out original text.
	System.out.println(str);

        // Parse through text for numbers.
        System.out.println("All Decimals Numbers ");
        parseNum(str);
    }

    static void parseNum(String str) {
        int beginParseIndex;
        int endParseIndex;
        int intLength;
        Number num = null;
        FieldPosition fp = null;
        StringBuffer strBuf;

        while (parsePos.getIndex() < str.length()) {

            beginParseIndex = parsePos.getIndex();

	    // Parse the string starting at parsePos for a number.
            num = decimalForm.parse(str, parsePos);

            endParseIndex = parsePos.getIndex();


	    if (num != null) {

	        // Calculate the length of the integer portion of index.
                fp = new FieldPosition(NumberFormat.INTEGER_FIELD);
                strBuf = new StringBuffer("");
                long lg = new Integer(beginParseIndex).longValue();
                decimalForm.format(lg, strBuf, fp);
                intLength = fp.getEndIndex() - fp.getBeginIndex();

                System.out.print("Index: ");
                printSpaces(4 - intLength);
                System.out.print(beginParseIndex + "  ");
                System.out.println("Number: " + num);
	    }
            parsePos.setIndex(endParseIndex + 1);
        }
        // Reset parse position to 0 for next loop.
        parsePos.setIndex(0);
    }

    // Print spaces
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
