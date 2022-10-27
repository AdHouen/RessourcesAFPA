import java.text.SimpleDateFormat;

class Main {
    public static void main(String args[]) {

        // Create decimal format.
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
        System.out.println("Original pattern: " + sdf.toPattern());

        // Create a clone.
        SimpleDateFormat sdfCopy = (SimpleDateFormat)sdf.clone(); 
        System.out.println("Copy's pattern:   " + sdf.toPattern());

        // Tests for equality.
        if (sdf.equals(sdfCopy)) {
            System.out.println("Clone is equal to original");
        }

        // Compute hashcode.
        int hc = sdf.hashCode();
        System.out.println("Hash code:        " + hc);
    }
}
