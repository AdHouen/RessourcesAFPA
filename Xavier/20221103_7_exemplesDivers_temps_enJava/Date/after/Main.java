import java.util.Date;

class Main {
    public static void main(String[] args) {
        Date d1 = new Date();                   // now
        Date d2 = new Date(d1.getTime()+1000);  // add one second

        System.out.println(d1.equals(d2));      // false
        System.out.println(d1.after(d2));       // false
        System.out.println(d1.before(d2));      // true
    }
}
