class Facto{
public static int getFactorial(int fac){
int fact=1;
for(int i=1;i<=fac;i++){
fact=fact*i;
}
return fact;
}
}