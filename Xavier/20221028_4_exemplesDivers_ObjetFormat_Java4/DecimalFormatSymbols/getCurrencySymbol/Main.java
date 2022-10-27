import java.text.NumberFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

class Main  {
    public static void main(String[] args) {

//
        // Create a new decimal format symbols for US
        DecimalFormatSymbols dfs;

        dfs = new DecimalFormatSymbols(Locale.US);

        // Print the currency symbols.
        System.out.println( dfs.getCurrencySymbol() );               // $
        System.out.println( dfs.getInternationalCurrencySymbol() );  // USD
        System.out.println( dfs.getMonetaryDecimalSeparator() );     // .

        // Create a new decimal format symbols for UK
        dfs = new DecimalFormatSymbols(Locale.UK);

        // Print the currency symbols.
        System.out.println( dfs.getCurrencySymbol() );               // £
        System.out.println( dfs.getInternationalCurrencySymbol() );  // GPB
        System.out.println( dfs.getMonetaryDecimalSeparator() );     // .
//
    }
}



