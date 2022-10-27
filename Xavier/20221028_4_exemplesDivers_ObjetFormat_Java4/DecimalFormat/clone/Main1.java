package vol1examples.text.DecimalFormat.clone;

import java.text.DecimalFormat;

class Main {
    public static void main(String args[]) {

        // Create decimal format.
        DecimalFormat df = new DecimalFormat("#,###0.00");
        System.out.println("Original pattern: " + df.toPattern());

        // Create a clone.
        DecimalFormat dfCopy = (DecimalFormat)df.clone(); 
        System.out.println("Copy's pattern:   " + df.toPattern());

        // Tests for equality.
        if (df.equals(dfCopy)) {
            System.out.println("Clone is equal to original");
        }

        // Compute hashcode.
        int hc = df.hashCode();
        System.out.println("Hash code:        " + hc);
    }
}
