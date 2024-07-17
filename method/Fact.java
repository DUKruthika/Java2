class FactorialRunner{
	
	public static void main(String[] facts){
		int n=7;
		int r=5;	
		int result=Factorial.getFactorial(n)/Factorial.getFactorial(n-r);
		System.out.println("nPr="+result);
		
		int result2=Factorial.getFactorial(n)/(Factorial.getFactorial(n-r)*Factorial.getFactorial(r));
		System.out.println("nCr="+result2);
	}
}