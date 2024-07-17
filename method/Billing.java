class Billing{
 static String itemName;
 static int price;
 static int list;
 static String name;
 static String whatTime;
 static boolean isrequirement;
   public static boolean infoNeeded(String items,int amount ,int quantity,String Name,String time, boolean isBagRequired){
 boolean isBillingDone=false;
 boolean isItemsValid=false;
 boolean isAmountValid=false;
 boolean isQuantityValid=false;
 boolean isNameValid=false;
 boolean isTimeValid=false;
 boolean isBagRequiredValid=false;
 
 if(items!=null){
 itemName=items;
 isItemsValid=true;
 }
 else{
 System.out.println("Items are not valid");
 }
 if(amount>0){
 price=amount;
 isAmountValid=true;
 }
 else{
 System.out.println("Amount not paid");
 }
 if(quantity>0){
 list=quantity;
 isQuantityValid=true;
 }
 else{
 System.out.println("Some of the items are missing");
 }
 if(Name!=null){
 name=Name;
 isNameValid=true;
 }
 else{
 System.out.println("Enter correct name");
 }
 if(time!=null){
 whatTime=time;
 isTimeValid=true;
 }
 else{
 System.out.println("Enter the corrrect time");
 }
 if(isBagRequired==true){
 isrequirement=isBagRequired;
 isBagRequiredValid=true;
 }
 else{
 System.out.println("Enter proper data");
 }
 if(isItemsValid && isQuantityValid && isAmountValid && isNameValid && isTimeValid && isBagRequiredValid){
 isBillingDone=true;
 }
 return isBillingDone;
  }
 
  public static int getDetails(){
  int detailPrintAt=12;
  System.out.println("Your Items are:"+itemName);
  System.out.println("Total Price is:"+price);
  System.out.println("Quantity of items are:"+list);
  System.out.println("Name of the Shop:"+name);
  System.out.println("Time of billing:"+whatTime);
  System.out.println("Is paper bag required:"+isrequirement);
  return detailPrintAt;
  }
}