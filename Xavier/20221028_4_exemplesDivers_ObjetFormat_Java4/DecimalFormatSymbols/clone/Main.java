package vol1examples.text.DecimalFormatSymbols.clone;

import java.text.DecimalFormatSymbols;
import java.util.Locale;

class Main {

    public static void main(String args[]) {

        // Create decimal format symbols.
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.ITALIAN);
        System.out.println("Original decimal sep: " + 
                                                 dfs.getDecimalSeparator());

        // Create a clone.
        DecimalFormatSymbols dfsCopy = (DecimalFormatSymbols)dfs.clone(); 
        System.out.println("Copy's decimal sep:   " +
                                                 dfs.getDecimalSeparator());

        // Test for equality.
        if (dfs.equals(dfsCopy)) {
            System.out.println("Clone is equal to original");
        }

        // Compute hashcode
        int hc = dfs.hashCode();
        System.out.println("Hash code:            " + hc);
    }
}
