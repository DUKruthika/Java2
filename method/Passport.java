class Passport{
static String cprt;
static int dcrd;
static String surN;
static String giveN;
static String dobs;
static String eml;
static boolean iseml;
static String logid;
static String pwds;
static String cpwd;
static String hintQ;
static String hintA;
static String capt;




public static boolean createPassport(String cprLocation,int dcdrLocation,String surName,
String giveName,String dob,String email,
boolean isEmailLoginSame,String loginId,String pwd,
String confirmPwd,String hintQues,String hintAns,String captcha){
boolean isPassportCreated=false;
boolean isdcdrLocation=false;
System.out.println("createPassport method started");
if(cprLocation!=null && dcdrLocation>0 && surName!=null && confirmPwd!=null && isEmailLoginSame==true && loginId!=null && pwd!=null && hintAns!=null && hintQues!=null && captcha!=null){
	System.out.println("the details are valid...");
cprt=cprLocation;
 dcrd=dcdrLocation;
 surN=surName;
giveN=giveName;
 dobs=dob;
 eml=email;
 iseml=isEmailLoginSame;
 logid=loginId;
 pwds=pwd;
 cpwd=confirmPwd;
 hintQ=hintQues;
 hintA=hintAns;
 capt=captcha;

 isPassportCreated=true;
 System.out.println("Passort created");
 }
 else{
	 System.out.println("please provide correct details");
 }
return isPassportCreated;
}
public static void fetchDetails(){
	System.out.println("method started");
System.out.println("the value cprLocation is:"+cprt);
System.out.println("the value for dcdrLocation:"+dcrd);
System.out.println("the surName  :"+surN);
System.out.println("giveName is:"+giveN);
System.out.println("date of birth is:"+dobs);
System.out.println("mail is:"+eml);
System.out.println("it is same:"+iseml);
System.out.println("the id is:"+logid);
System.out.println("password  is:"+pwds);
System.out.println("pwd is confirmis:"+cpwd);
System.out.println("hint question:"+hintQ);
System.out.println("the hint answer is:"+hintA);
System.out.println("captcha is:"+capt);
System.out.println("method ended");

}
}
