class AxisBank{
static String fulname;
static String email;
static long aadharnum;
static long phonenum;
static char genderconfirm;
static String birthdate;
static String pancard;
static String nomini;
public static boolean createAccount(String fullName,String Email,long AadharNo,long PhoneNumber,char Gender,String Dob,String Pan,String Nomeenie){
boolean isAccountCreate=false;
if(fullName!=null && Email!=null && AadharNo>0 && Dob!=null && PhoneNum>0 && Pan!=null){
System.out.println("provide details...");
fulname=fullName;
email=Email;
aadharnum=AadharNo;
phonenum=PhoneNumber;
genderconfirm=Gender;
birthdate=Dob;
pancard=Pan;
nomini=Nomeenie;
boolean isAccountCreate=true;
System.out.println("account ctreated..");
}
else{
System.out.println("plxx provide valid details");
}
return isAccountCreate;
}
public static void getDetails(){
System.out.pritnln("the user name is:"+fulname);
System.out.println("mail id is:"+email);
System.out.println("aadharnum is:"aadharnum);
System.out.println("mobile no is:"+phonenum);
System.out.println("gender is:"+)
}
