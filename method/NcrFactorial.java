class NcrFactorial{
public static void main(String[] num){
int n=10;
int r=6;
int final=Facto.getFactorial(n)/(Facto.getFactorial(n-r)*Facto.getFactorial(r));
System.out.println("the result of the number is:"+final);
}
}