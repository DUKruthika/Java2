class CompanyChart{
static String enrolledAs;
static String course;
static int amount;
static int workingTime;
static int daysOfWork;
static String learnt;
 public static int startCompany(String name,String skills,int salary,int noOfWorkingHrs,int workingDays,String experience){
 int date=21;
 enrolledAs=name;
 course=skills;
 amount=salary;
 workingTime=noOfWorkingHrs;
 daysOfWork=workingDays;
 learnt=experience;
 return date;
 }
 
  public static int getDetails(){
  int detailPrintAt=12;
  System.out.println("Name of your startup :"+enrolledAs);
  System.out.println("Skills required:"+course);
  System.out.println("Expected Salary:"+amount);
  System.out.println("Your Working hours are:"+workingTime);
  System.out.println("No of days you are requested to work:"+daysOfWork);
  System.out.println("Total years of Experience:"+learnt);
  return detailPrintAt;
  }
}