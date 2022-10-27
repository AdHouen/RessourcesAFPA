package vol1examples.text.ParseException;

import java.text.*;
import java.io.*;
import java.util.*;

class Main {

    // Create a date format.
    static DateFormat dateForm = DateFormat.getDateInstance(DateFormat.SHORT);

    Main (String str) {
        // Print out original text passed in.
	System.out.println("String: " + str);

        // Parse the text for a short date.
        parseDate(str);
    }

    static void parseDate(String str) {
        int beginParseIndex;
        int endParseIndex;
        Date d = null;

        // Parse the string for a date.
        try {
            d = dateForm.parse(str);
        } catch (ParseException pe) {
            System.out.println("Parse error at offset: " + pe.getErrorOffset());
        }

        // Format the date to a string for printout.
        if (d != null) {
            System.out.println("\nParsed the string for the short date:");
            System.out.print("Date:   ");
            System.out.println(dateForm.format(d));
        }
    }

    public static void main(String[] args) {

        // Accept a date string as an argument
        if (args.length != 1) {
            System.err.println("This program parses text for dates");
            System.err.println("Usage: java Main <shortdate>");
            System.exit(1);
        }

        new Main(new String(args[0]));
    }
}
