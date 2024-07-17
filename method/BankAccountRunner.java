class BankAccountRunner{
public static void main(String[] money){
BankAccount.credit(10000);
double value=BankAccount.getBalance();
System.out.println(value);
  BankAccount.credit(2000.00);
  value=BankAccount.getBalance();
  System.out.println(value);
  BankAccount.credit(3000.00);
  value=BankAccount.getBalance();
  System.out.println(value);
    BankAccount.credit(4000.00);
  value=BankAccount.getBalance();
  System.out.println(value);
    BankAccount.debit(200000);
  value=BankAccount.getBalance();
  System.out.println(value);
    BankAccount.debit(300000);
  value=BankAccount.getBalance();
  System.out.println(value);
    BankAccount.debit(500000);
  value=BankAccount.getBalance();
  System.out.println(value);
  
}
}