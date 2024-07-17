class Dominoz{
public static double collectOrder(String flavour){
	double price=0.0;
if(flavour=="veggie"){
return 269.00;
}
if(flavour=="tandoori"){
return 319.00;
}
if(flavour=="onion"){
return 129.00;
}
if(flavour=="cheese"){
return 219.00;
}
if(flavour=="capsicum"){
return 109.00;
}
if(flavour=="goldencorn"){
return 89.00;
}
if(flavour=="mexican"){
return 279.00;
}
if(flavour=="cheesecorn"){
return 225.00;
}
if(flavour=="overload"){
return 349.00;
}
if(flavour=="margherita"){
return 789.00;
}
if(flavour=="garlic"){
return 189.00 ;
}
if(flavour=="gourmet"){
return 549.00;
}
if(flavour=="jalapeno"){
return 196.00;
}
if(flavour=="redhot"){
return 112.00;
}
if(flavour=="choco lava"){
return 110.00;
}
if(flavour=="paneer"){
return 225.00;
}
else{
System.out.println("The item is not avaliable");
}
return price;
}
public static double collectOrder(String flavour,int count){
	if(flavour=="veggie"){
		double price=269*count;
		return price;
}
	if(flavour=="tandoori"){
		double price=319*count;
		return price;
}
    if(flavour=="onion"){
		double price=129*count;
		return price;
}
     if(flavour=="cheese"){
		double price=219*count;
		return price;
}
     if(flavour=="capsicum"){
		double price=109*count;
		return price;
}
     if(flavour=="goldencorn"){
		double price=89*count;
		return price;
}	
  else{
	 System.out.println("item not avalible"); 
  }
return 0.0;
}
}  