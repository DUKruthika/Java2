class Travel{
static String pname;
static String mail;
static String mode;
static int seatno;
static boolean health;
static float starrating;
public static void booking(String PassengerName,String Mail,String BookingMode,int Seatnum,boolean Health,float Rating){
	pname=PassengerName;
	mail=Mail;
	mode=BookingMode;
	seatno=Seatnum;
	health=Health;
	starrating=Rating;
}
public static void fetch(){
System.out.println("passeger name is:"+pname);
System.out.println("id being used is:"+mail);
System.out.println("the mode of bookin:"+mode);
System.out.println("allocation:"+seatno);
System.out.println("is there any issue in health:"+health);
System.out.println("rating:"+starrating);
}
}
