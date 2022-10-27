import java.io.*;
import java.text.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java Main <outputfile>");
            System.exit(1);
        }

        Locale[] locs = Calendar.getAvailableLocales();
        Date date = new Date();
        try {
            BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(args[0]), "UTF8"));

            for (int i=0; i<locs.length; i++) {
                DateFormat df = DateFormat.getDateTimeInstance(
                        DateFormat.FULL, DateFormat.FULL, locs[i]);
                wr.write(locs[i] + ": " + df.format(date));
                wr.newLine();
            }
            wr.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
