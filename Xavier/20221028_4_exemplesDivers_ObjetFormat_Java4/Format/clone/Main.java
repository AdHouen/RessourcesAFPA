package vol1examples.text.Format.clone;

import java.text.NumberFormat;

class Main {

    public static void main(String args[]) {

        NumberFormat nf = NumberFormat.getInstance();

        // create string character iterator
        nf.setMinimumFractionDigits(5);
        System.out.println(nf.getMinimumFractionDigits());   // prints '5'

        // create a clone 
        NumberFormat nfCopy = (NumberFormat)nf.clone(); 
        System.out.println(nfCopy.getMinimumFractionDigits());   // prints '5'

        if(nf.equals(nfCopy)) {
            System.out.println("Copy is equal to original");
        } else {
            System.out.println("Copy is not equal to original");
        }

        // compute hashcode
        int hc = nf.hashCode();
        System.out.println("Hash code is: " + hc);
    }
}
