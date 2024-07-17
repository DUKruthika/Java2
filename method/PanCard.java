class PanCard{
static int dob;
static String name;
static long adarcard;
static long bankno;
static String fathername;
static boolean picture;
public static void transaction(int Birthcard,String Name,long Aadharcard,long Accountnumber,String FatherName,boolean Photo){
dob=Birthcard;
name=Name;
adarcard=Aadharcard;
bankno=Accountnumber;
fathername=FatherName;
picture=Photo;
}
public static void readInformation() {
System.out.println("the birth date is:"+dob);
System.out.println("the name is:"+name);
System.out.println("card number is:"+adarcard);
System.out.println("bank number is:"+bankno);
System.out.println("appa name is:"+fathername);
System.out.println("super photo:"+picture);
}
}