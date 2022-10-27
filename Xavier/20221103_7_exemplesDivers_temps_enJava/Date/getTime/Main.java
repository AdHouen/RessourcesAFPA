import java.util.Date;
import java.io.DataInputStream;
import java.io.IOException;

class Test {
    public static void tests() {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
        }
    }
}
class Main {
    public static void main(String[] args) {
        Date startTime = new Date();
        Test.tests();
        Date endTime = new Date();
        System.out.println("Tests took: " + 
                           (endTime.getTime() - startTime.getTime()) +
                           " ms");
    }
}
