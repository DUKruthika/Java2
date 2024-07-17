class BankAccount{
static double balance;
public static void credit(double amount){
	System.out.println("credit started");
	if(amount>0){
    balance=balance+amount;
	}
	else{
		System.out.println("amount must be greater than zero");
	}
	System.out.println("credit ended");
}
public static void debit(double amount){
	System.out.println("debit started");
	if(balance>=amount){
    balance=balance-amount;
  }
  else{
	 System.out.println("insufficient balance");
 }
  System.out.println("debit ended");
}
public static double getBalance(){
return balance;
}
}