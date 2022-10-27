import java.awt.*;
import java.io.*;
import java.util.*;

class UnicodeViewer extends Frame {
    UnicodeViewer(Vector lines) {
        add(BorderLayout.CENTER, new TextCanvas(lines));

        setSize(400, 400);
        show();
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java Main <inputfile>");
            System.exit(1);
        }
        try {
            // Read in the entire contents of the file.
            BufferedReader rd = new BufferedReader(
                new InputStreamReader(new FileInputStream(args[0]), "UTF8"));
            String line;
            Vector lines = new Vector();

            while ((line = rd.readLine()) != null) {
                    lines.addElement(line);
            }

            rd.close();
            new UnicodeViewer(lines);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class TextCanvas extends Component {
    FontMetrics fontM;
    Font font = new Font("Monospaced", Font.PLAIN, 10);
    Vector lines;
    TextCanvas(Vector lines) {
        this.lines = lines;
    }

    public void paint(Graphics g) {
        if (fontM == null) {
            fontM = g.getFontMetrics(font);
        }
        setFont(font);

        int x = fontM.getHeight()/2;
        int y = fontM.getHeight()/2 + fontM.getAscent();
        
        for (int i=0; i<lines.size(); i++) {
            g.drawString((String)lines.elementAt(i), x, y);
            y += fontM.getHeight();
        }
    }
}
