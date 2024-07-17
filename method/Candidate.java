class Candidate{
static String name;
static String sslcmarks;
static int pucmarks;
static int cetnumber;
static String income;
static boolean eligible;
public static boolean admission(String Name, String SSLCmarks,int PUCmarks,int CETnumber,String INcome,boolean Eligible){
	boolean isAdmissionDone=false;
boolean isGivenNamevalid=false;
boolean isGivenSSLCmarksisValid=false;
boolean isGivePUCmarksValid=false;
boolean isGivenCETnumberValid=false;
boolean isGivenINcomeValid=false;
boolean isTheyEligible=false;
{
    if(Name!=null){
        name=Name;
		isGivenNamevalid=true;
	}
		else{
			System.out.println("provide valid name");
    }
    if(SSLCmarks!=0){
        sslcmarks=SSLCmarks;
		isGivenSSLCmarksisValid=true;
    }
	else{
		System.out.println("provise valise marks");
	}
    if(PUCmarks!=0){
     pucmarks=PUCmarks;
	 isGivePUCmarksValid=true;
    }
	else{
		System.out.println("provide valid marks of puc");
	}
    if(CETnumber!=0){
     cetnumber=CETnumber;
	 isGivenCETnumberValid=true;
    }
	else{
		System.out.println("vaild cetnumber required");
	}
    if(income!=null){
        income=INcome;
    }
    if(Eligible!=true){
             eligible=Eligible;
          isGivenINcomeValid=true;
    }
	else{
		System.out.println("provide valid income");
	}
	if(isGivenNamevalid && isGivenSSLCmarksisValid && isGivePUCmarksValid && isGivenCETnumberValid && isGivenINcomeValid && isTheyEligible)
		isAdmissionDone=true;
}
return isAdmissionDone;
}
public static void getInfo(){
System.out.println("the name is:"+name);
System.out.println("the marks of sslc is:"+sslcmarks);
System.out.println("the pu marks is:"+pucmarks);
System.out.println("the cet number is:"+cetnumber);
System.out.println("the income is:"+income);
System.out.println("they are eligible:"+eligible);
}
}



