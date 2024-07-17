class MedicineFile{
static String patientName;
static String name;
static int year;
static int number;
static int days;
static String group;
 public static int detailsInFile(String name,String disease,int age,int phoneNo,int noOfAdmitDays ,String bloodGroup){
 int date=21;
 patientName=name;
 name=disease;
 year=age;
 number=phoneNo;
 days=noOfAdmitDays;
 group=bloodGroup;
 return date;
 }
 
  public static int getDetails(){
  int detailPrintAt=12;
  System.out.println("Name of the Patient is :"+patientName);
  System.out.println("Patient is suffering from:"+name);
  System.out.println("Age of the Patientis:"+year);
  System.out.println("Patient contact details:"+number);
  System.out.println("Admitted since:"+days);
  System.out.println("Blood Group of the patient is:"+group);
  return detailPrintAt;
  }
}