class Amazon1{
  static String name;
  static int passcode;
  static long number;
  static String mailID;
  static boolean customer;
  static String proof;
  static boolean isAccountCreated=false;
	public static boolean createAccount(String Name,int otp,long phoneNumber,String email,boolean isNewCustomer,String id){
	
	boolean isGivenNameValid=false;
	boolean isGivenOtpValid=false;
	boolean isGivenPhoneNumberValid=false;
	boolean isGivenEmailValid=false;
	boolean isNewValid=false;
	boolean isGivenIdValid=false;
	if(Name!= null){
	name=Name;
	isGivenNameValid=true;
	}
	else{
	System.out.println("Enter a valid name");
	}
	if(otp>0){
	passcode=otp;
	isGivenOtpValid=true;
	}
    else{
	System.out.println("Enter a valid OTP");
	}
	if(phoneNumber>0){
	number=phoneNumber;
    isGivenPhoneNumberValid=true;	
	}
    else{
	System.out.println("enter 10 digit number");
	}
	if(email!=null){
	mailID=email;
	isGivenEmailValid=true;
	}
	else{
	System.out.println("The entered emailId is not found");
	}
	if(isNewCustomer==true){
	customer=isNewCustomer;
	isNewValid=true;
	}
	else{
	System.out.println("You already have an account");
	}
	if(id!=null){
	proof=id;
	isGivenIdValid=true;
	}
	else{
	System.out.println("ID is invalid");
	}
	if(isGivenNameValid && isGivenOtpValid && isGivenPhoneNumberValid && isGivenEmailValid && isNewValid && isGivenIdValid){
		isAccountCreated=true;
		}
	return isAccountCreated;
	
	}
	public static void getAccountDetails(){
		if(isAccountCreated){
			//double newAccountNumber=3456356346476574533l;
	   System.out.println("Name of the User is:"+name);
	   System.out.println("Enter the Passcode:"+passcode);
	   System.out.println("Please enter your Phone number:"+number);
	   System.out.println("Enter your mailID :"+mailID);
	   System.out.println("Are you a new customer:"+customer);
	   System.out.println("Enter your Id proof type:"+proof);

	//return newAccountNumber;
		
		}
	else{
		System.out.println("Account not created");
	}
}
}