package vol1examples.text.DecimalFormat.DecimalFormat;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.io.*;

class Main {

    Main(String myPattern, String[] myStrings) {
        NumberFormat form;

        DecimalFormat df = new DecimalFormat(myPattern);
        String pattern = df.toPattern();

        // Print the pattern.
        System.out.println("PATTERN");
        System.out.println(pattern);
        System.out.println("");

        // Print the numbers.
        System.out.print("ORIGINAL STRING");
        printSpaces("ORIGINAL STRING", 20);
        System.out.println("FORMATTED STRING");
  
        for (int i=0; ((myStrings[i] != null) & (i < myStrings.length)); i++) {
            System.out.print(myStrings[i]);
            printSpaces(myStrings[i], 20);
            System.out.println(df.format(new Double(myStrings[i])));
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java Main <filename>");
            System.exit(1);
        }

        try {
            // Read in the entire contents of the file.
            // Convert the contents so that the new line is '\n'.
            BufferedReader rd = new BufferedReader(new FileReader(args[0]));
            String sep = System.getProperty("line.separator");
            String line;
            String[] myStrings = new String[100];
            String myPattern = null;

            // Read in the pattern.
            if ((line = rd.readLine()) != null) {
                myPattern = line;
            }

            int i = 0;

            // Read in the numbers.
            while ((line = rd.readLine()) != null) {
                myStrings[i] = new String(line);
                i++;
            }
            rd.close();

            new Main(myPattern, myStrings);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void printSpaces(String s, int column) {
        for (int i = s.length(); i < column; i++) {
            System.out.print(" ");
        }
    }
}
