package vol1examples.text.DecimalFormatSymbols.setDigit;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.awt.*;

class Main extends Frame {
    TextArea textArea = 
        new TextArea("", 30, 100, TextArea.SCROLLBARS_VERTICAL_ONLY);

    Main(StringBuffer strbuf) {
        super("DecimalFormatSymbols Example");

        // Set the text and add the layout to text area.
        textArea.setText(strbuf.toString());
        add(textArea, BorderLayout.CENTER);

        // Set size and show window.
        Font f = new Font("Courier", Font.PLAIN, 12);
        textArea.setFont(f);
        setSize(600, 200);
        show();
    }

    public static void main(String[] args) {
        StringBuffer strbuf = new StringBuffer(1500);
        Locale[] locales = NumberFormat.getAvailableLocales();

        // Loop through all locales looking for US
        for (int i = 0; i < locales.length; ++i) {

            // Skip if country is not US.
            if (!(locales[i].getCountry().equals("US"))) {
                continue;
            }

            // Build up string to display in a string buffer
            strbuf.append(locales[i].getDisplayName()).append("\n\n");
            strbuf.append("zero  group decimal permill percent digit " +
                 "pattern  nan    minus infinity \n");
            strbuf.append("digit  sep    sep                         " + 
                 "  sep           sign \n");

            // Create a new decimal format symbols for US
            DecimalFormatSymbols dfs = new DecimalFormatSymbols(locales[i]);

            // Append characters to string buffer
            String spacer = "      ";
            strbuf.append("  "
                             + dfs.getZeroDigit() + spacer
                             + dfs.getGroupingSeparator() + spacer
                             + dfs.getDecimalSeparator() + spacer
                             + dfs.getPerMill() + spacer
                             + dfs.getPercent() + spacer
                             + dfs.getDigit() + spacer
                             + dfs.getPatternSeparator() + spacer
                             + dfs.getNaN() + spacer
                             + dfs.getMinusSign() + spacer
                             + dfs.getInfinity() + "\n\n"
            );

            // Assign new arbitrary characters for symbols.
            dfs.setZeroDigit('0');
            dfs.setGroupingSeparator('g');
            dfs.setDecimalSeparator('d');
            dfs.setPerMill('M');
            dfs.setPercent('P');
            dfs.setDigit('D');
            dfs.setPatternSeparator(';');
            dfs.setNaN("NaN");
            dfs.setMinusSign('m');
            dfs.setInfinity("inf");    

            // Append characters to string buffer
            strbuf.append("  "
                             + dfs.getZeroDigit() + spacer
                             + dfs.getGroupingSeparator() + spacer
                             + dfs.getDecimalSeparator() + spacer
                             + dfs.getPerMill() + spacer
                             + dfs.getPercent() + spacer
                             + dfs.getDigit() + spacer
                             + dfs.getPatternSeparator() + spacer
                             + dfs.getNaN() + spacer
                             + dfs.getMinusSign() + spacer
                             + dfs.getInfinity() + "\n\n"
            );

            // Append formatted number (a string) to string buffer.
            NumberFormat form = NumberFormat.getInstance(locales[i]);

            try {
                // Chinese, Japanese, Korean numbers cannot cast to decimals
                DecimalFormat decform = (DecimalFormat)form;
                decform.setDecimalFormatSymbols(dfs);
                decform.applyLocalizedPattern("D00g000d00DD;mD00g000d00DD");

                // Append pattern to string buffer.
                strbuf.append(decform.toLocalizedPattern() + "\n");
                                                               // D00g000d00DD
                strbuf.append(decform.format(1234.56789) + "\n");
                                                               //  01g234d5679
            } catch (ClassCastException e ) {
                System.err.println("Exception casting a class");
            }
        }
        new Main(strbuf);
    }
}
