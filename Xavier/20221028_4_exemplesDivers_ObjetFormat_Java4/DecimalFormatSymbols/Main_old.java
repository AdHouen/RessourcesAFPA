package vol1examples.text.DecimalFormatSymbols;

import java.text.NumberFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.awt.*;

class Main extends Frame {
    TextArea textArea = new TextArea("", 30, 100, 
                                         TextArea.SCROLLBARS_VERTICAL_ONLY);

    Main(StringBuffer strbuf) {
        super("DecimalFormatSymbols Example");

        // Set the text and add the layout to text area.
        textArea.setText(strbuf.toString());
        add(textArea, BorderLayout.CENTER);

        // Set size and show window.
        Font f = new Font("Courier", Font.PLAIN, 12);
        textArea.setFont(f);
        textArea.setEditable(false);
        setSize(700, 500);
        show();
    }

    public static void main(String[] args) {
        StringBuffer strbuf = new StringBuffer(1500);
        Locale[] locales = NumberFormat.getAvailableLocales();

        strbuf.append("                 ");
        strbuf.append("zero  group decimal permill percent digit " + 
                                         "pattern  nan  minus infinity \n");
        strbuf.append("                 ");
        strbuf.append("digit  sep   sep                            " + 
                                                     "sep         sign \n");
        for (int i = 0; i < locales.length; ++i) {
            strbuf.append(locales[i].getDisplayName()).append("\n");

            // Print decimal format symbols
            DecimalFormatSymbols dfs = new DecimalFormatSymbols(locales[i]);
            String spacer = "      ";
            strbuf.append("                   "
                             + dfs.getZeroDigit() + spacer
                             + dfs.getGroupingSeparator() + spacer
                             + dfs.getDecimalSeparator() + spacer
                             + dfs.getPerMill() + spacer
                             + dfs.getPercent() + spacer
                             + dfs.getDigit() + spacer
                             + dfs.getPatternSeparator() + spacer
                             + dfs.getNaN() + spacer
                             + dfs.getMinusSign() + spacer
                             + dfs.getInfinity() + "\n"
            );
        }
        new Main(strbuf);
    }
}
