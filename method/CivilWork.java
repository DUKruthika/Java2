class CivilWork{
  static String type;
  static String stream;
  static int needed;
  static String span;
  static int employees;
  static int rupees;
  static boolean isConstructionDone=false;
     public static boolean requirementsNeeded(String cement,String worker,int amount,String time,int noOfWorkers,int salary){
	 boolean isCementValid=false;
	 boolean isWorkerValid=false;
	 boolean isAmountValid=false;
	 boolean isTimeValid=false;
	 boolean isNoOfWorkersValid=false;
	 boolean isSalaryValid=false;
	   if(cement!=null){
	    type=cement;
		isCementValid=true;
		}
		else{
		System.out.println("not a valid type of cement");
		}
       if(worker!=null){
		stream=worker;
		isWorkerValid=true;
		}
		else{
		System.out.println("invalid type of data");
		}
		if(amount>0){
		needed=amount;
		isAmountValid=true;
		}
		else{
		System.out.println("Enter the correct amount paid");
		}
		if(time!=null){
		span=time;
		isTimeValid=true;
		}
		else{
		System.out.println("The time entered is found to be wrong");
		}
		if(noOfWorkers>0){
		employees=noOfWorkers;
		isNoOfWorkersValid=true;
		}
		else{
		System.out.println("No of workers entered are wrong");
		}
		if(salary>0){
		rupees=salary;
		isSalaryValid=true;
		}
		else{
		System.out.println("Salary eneterd is found to be wrong");
		}
		if(isCementValid && isWorkerValid && isAmountValid && isTimeValid && isNoOfWorkersValid && isSalaryValid){
		isConstructionDone=true;
		}
	 
	 return isConstructionDone;
	 }
    public static void infoList(){
		if(isConstructionDone){
	System.out.println("Type of Cement used:"+type);
	System.out.println("Type of workers who are working:"+stream);
	System.out.println("Amount needed:"+needed);
	System.out.println("It can be completed within:"+span);
	System.out.println("No of workers who are working:"+employees);
	System.out.println("Salary per employe:"+rupees);
}
else{
System.out.println("Construction is stopped");
}
}
}