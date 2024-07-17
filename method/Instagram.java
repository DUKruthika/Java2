class Instagram {
    static long mobNumber;
    static String fname;
    static String uName;
    static String pwd;
    static String email;
    static boolean isInstagramIDCreated = false;
	public static boolean createAccount(long mobileNumber, String fullName, String userName, String password, String emailID){
		boolean isGivenMobileValid = false;
        boolean isGivenNameValid = false;
        boolean isGivenUserNameValid = false;
        boolean isGivenPasswordValid = false;
        boolean isGivenEmailValid = false;
	 if (mobileNumber != 0) {
       mobNumber   =      mobileNumber;
            isGivenMobileValid = true;
        } else {
            System.out.println("Please enter a valid mobile number.");
        }

     if (fullName != null) {
   fname  =       fullName;
            isGivenNameValid = true;
        } else {
            System.out.println("Please enter a valid full name.");
        }

   if (userName != null) {
     uName       =   userName;
            isGivenUserNameValid = true;
        } else {
            System.out.println("Please enter a valid username.");
        }
   if (password != null) {
      pwd       =  password;
            isGivenPasswordValid = true;
        } else {
            System.out.println("Please enter a valid password.");
        }

  if (emailID != null) {
     email   =     emailID;
            isGivenEmailValid = true;
        } else {
            System.out.println("Please enter a valid email ID.");
        }
   if (isGivenMobileValid && isGivenNameValid && isGivenUserNameValid && isGivenPasswordValid && isGivenEmailValid) {
            isInstagramIDCreated = true;
        }

    return isIDCreated;
    }

    public static void getDetails() {
        if (isInstagramIDCreated) {
            System.out.println("The entered mobile number is: " + mobNumber);
            System.out.println("The full name is: " + fname);
            System.out.println("The username is: " + uName);
			System.out.println("the password is :"+pwd);
            System.out.println("The email ID is: " + email);
        } else {
            System.out.println("No account details available. Please create an account first.");
        }
    }
}