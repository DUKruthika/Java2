class FactoRunner{
public static void main(String[] fb){
int n=5;
int r=3;
int result1=Facto.getFactorial(n)/Facto.getFactorial(n-r);
System.out.println("the value of npr is:"+result1);
int final1=Facto.getFactorial(n)/(Facto.getFactorial(n-r)*Facto.getFactorial(r));
System.out.println("the result of the number is:"+final1);
}
}
