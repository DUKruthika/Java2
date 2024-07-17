class GetKtech {
    static String userName;
    static long contactNumber;
    static String address;
    static String email;
    static String userId;
    static boolean isMyntraAccountCreated = false;

    public static boolean createAccount(String name, long phone, String addr, String emailId, String userId) {
        boolean isNameValid = false;
        boolean isPhoneValid = false;
        boolean isAddressValid = false;
        boolean isEmailValid = false;
        boolean isUserIdValid = false;

        if (name != null) {
            userName = name;
            isNameValid = true;
        } else {
            System.out.println("Please enter a valid name.");
        }

        if (phone != 0) {
            contactNumber = phone;
            isPhoneValid = true;
        } else {
            System.out.println("Please enter a valid phone number.");
        }

        if (addr != null) {
            address = addr;
            isAddressValid = true;
        } else {
            System.out.println("Please enter a valid address.");
        }

        if (emailId != null) {
            email = emailId;
            isEmailValid = true;
        } else {
            System.out.println("Please enter a valid email ID.");
        }

        if (userId != null) {
            userId = userId;
            isUserIdValid = true;
        } else {
            System.out.println("Please enter a valid user ID.");
        }

        if (isNameValid && isPhoneValid && isAddressValid && isEmailValid && isUserIdValid) {
            isMyntraAccountCreated = true;
        }

        return isMyntraAccountCreated;
    }

    public static void getDetails() {
        if (isMyntraAccountCreated) {
            System.out.println("The name is: " + userName);
            System.out.println("The contact number is: " + contactNumber);
            System.out.println("The address is: " + address);
            System.out.println("The email ID is: " + email);
            System.out.println("The user ID is: " + userId);
        } else {
            System.out.println("No account details available. Please create an account first.");
        }
    }
}
