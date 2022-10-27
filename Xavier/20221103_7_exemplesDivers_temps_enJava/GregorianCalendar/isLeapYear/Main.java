import java.util.*;
import java.text.*;

class Main {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        int year = cal.get(Calendar.YEAR);

        // Julian Leap Years
        for (int i=1400; i<1582; i++) {
            if (cal.isLeapYear(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
// 1400 1404 1408 1412 1416 1420 1424 1428 1432 1436 1440 1444 1448 1452 1456 
// 1460 1464 1468 1472 1476 1480 1484 1488 1492 1496 1500 1504 1508 1512 1516 
// 1520 1524 1528 1532 1536 1540 1544 1548 1552 1556 1560 1564 1568 1572 1576 
// 1580 


        // Gregorian Leap Years
        for (int i=1582; i<1708; i++) {
            if (cal.isLeapYear(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
// 1584 1588 1592 1596 1600 1604 1608 1612 1616 1620 1624 1628 1632 1636 1640 
// 1644 1648 1652 1656 1660 1664 1668 1672 1676 1680 1684 1688 1692 1696 1704 

        // Modify the Gregorian cutover date to year 0.
        System.out.println(cal.getGregorianChange());
                                           // Thu Oct 04 17:00:00 PDT 1582
        cal.setGregorianChange(
            new GregorianCalendar(0, Calendar.JANUARY, 1).getTime());
        for (int i=1400; i<1582; i++) {
            if (cal.isLeapYear(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
// 1404 1408 1412 1416 1420 1424 1428 1432 1436 1440 1444 1448 1452 1456 1460 
// 1464 1468 1472 1476 1480 1484 1488 1492 1496 1504 1508 1512 1516 1520 1524 
// 1528 1532 1536 1540 1544 1548 1552 1556 1560 1564 1568 1572 1576 1580  
    }
}
