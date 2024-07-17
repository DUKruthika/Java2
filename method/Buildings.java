class Buildings{
  static String type;
  static String stream;
  static int needed;
  static String span;
  static int employees;
  static int rupees;
     public static String requirementsNeeded(String cement,String worker,int amount,String time,int noOfWorkers,int salary){
	    String started="yes";
	    type=cement;
		stream=worker;
		needed=amount;
		span=time;
		employees=noOfWorkers;
		rupees=salary;
	 
	 return started;
	 }
    public static void infoList(){

	System.out.println("Type of Cement used:"+type);
	System.out.println("Type of workers who are working:"+stream);
	System.out.println("Amount needed:"+needed);
	System.out.println("It can be completed within:"+span);
	System.out.println("No of workers who are working:"+employees);
	System.out.println("Salary per employe:"+rupees);
	

}

}