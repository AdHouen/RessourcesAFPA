import java.util.*;
import java.text.*;

class test {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.clear(Calendar.MONTH);
        System.out.println(new SimpleDateFormat("MMM dd yyyy").format(cal));
    }
}
