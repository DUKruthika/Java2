class HealthCare{
static String patientName;
static String name;
static int year;
static int number;
static int days;
static String group;
static boolean isHealthCheckupDone=false;
 public static boolean detailsInFile(String name,String disease,int age,int phoneNo,int noOfAdmitDays ,String bloodGroup){
  boolean isNameValid=false;
  boolean isDiseaseValid=false;
  boolean isAgeValid=false;
  boolean isPhoneNoValid=false;
  boolean isNoOfDaysValid=false;
  boolean isBloodGroupValid=false;
  
  if(name!=null){
  patientName=name;
  isNameValid=true;
  }
  else{
   System.out.println(" Please enter a valid name!!");
   }
   if(disease!=null){
  name=disease;
  isDiseaseValid=true;
  }
  else{
  System.out.println("The report says about another disease");
  }
  if(age>0){
  year=age;
  isAgeValid=true;
  }
  else{
  System.out.println("Enter the correct age");
  }
  if(phoneNo>0){
  number=phoneNo;
  isPhoneNoValid=true;
  }
  else{
  System.out.println("Pkease enter 10 didit number");
  }
 if(noOfAdmitDays>0){
 days=noOfAdmitDays;
 isNoOfDaysValid=true;
 }
 else{
 System.out.println("Please check the report and enter");
 }
  if(bloodGroup!=null){
  group=bloodGroup;
  isBloodGroupValid=true;
  }
  else{
  System.out.println("Blood group is not matching");
  }
  if(isNameValid && isPhoneNoValid && isNoOfDaysValid && isAgeValid && isBloodGroupValid && isDiseaseValid ){
  isHealthCheckupDone=true;
  }
  return isHealthCheckupDone;
 }
 
  public static void getDetails(){
  if(isHealthCheckupDone){
  System.out.println("Name of the Patient is :"+patientName);
  System.out.println("Patient is suffering from:"+name);
  System.out.println("Age of the Patientis:"+year);
  System.out.println("Patient contact details:"+number);
  System.out.println("Admitted since:"+days);
  System.out.println("Blood Group of the patient is:"+group);
  }
  else{
  System.out.println("HealthCheckup cannot be done");
  }
}
}