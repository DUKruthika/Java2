class Amazon{
static String name;
static int otp;
static boolean notifys;
static String address;
static long phonenum;
public static void account(String UserName,int OTP,boolean notification,String Address,long PhoneNumber){
name=UserName;
otp=OTP;
notifys=notification;
address=Address;
phonenum=PhoneNumber;
}
public static void fetchDetails(){
System.out.println("the name of the user is:"+name);
System.out.println("otp being shared is:"+otp);
System.out.println("the application notifies:"+notifys);
System.out.println("user addressis:"+address);
System.out.println("calling number is:"+phonenum);
}
}