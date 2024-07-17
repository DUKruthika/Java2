class Candidate{
static String name;
static int sslcmarkscard;
static int pucmarkscard;
static int cetnumber;
static String income;
static boolean eligible;
public static int admission(String name, int sslcmarks,int pucmarks,int cetnumber,String income,boolean eligible){
int isAdmissionDone=12356;
name=name;
sslcmarkscard=sslcmarkscard;
pucmarkscard=pucmarkscard;
cetnumber=cetnumber;
income=income;
eligible=eligible;
return isAdmissionDone;
}
public static void getinfo(){
System.out.println("the name is:"+name);
System.out.println("the marks of sslc is:"+sslcmarkscard);
System.out.println("the pu marks is:"+pucmarkscard);
System.out.println("the cet number is:"+cetnumber);
System.out.println("the income is:"+income);
System.out.println("they are eligible:"+eligible);
}
}



