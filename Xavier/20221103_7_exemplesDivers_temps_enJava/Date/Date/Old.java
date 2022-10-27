import java.util.Date;

class Old {
    public static void main(String[] args) {
//
	Date ymd = new Date(89, 9, 17);                // Oct 17, 1989
	Date ymdhm = new Date(89, 9, 17, 17, 4);       // Oct 17, 1989, 5:04pm
	Date ymdhms = new Date(89, 9, 17, 17, 4, 15);  
						// Oct 17, 1989, 5:04:15pm

	Date s1 = new Date("17 Oct 1989 17:04:15");
	Date s2 = new Date("17 Oct 1989");
	Date s3 = new Date("Thu, 2 Nov 1995");
	Date s4 = new Date("Sat, 12 Aug 1995 13:30:00 GMT");
//
}
}
