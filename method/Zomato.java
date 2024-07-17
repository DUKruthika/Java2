
class Zomato{
public static double collectOrder(String fooditem){
if(fooditem=="bbq"){
return 169.00;
}
if(fooditem=="gobi"){
return 219.00;
}
if(fooditem=="onionrings"){
return 229.00;
}
if(fooditem=="cheesenachose"){
return 119.00;
}
if(fooditem=="mushroomdry"){
return 109.00;
}
if(fooditem=="papad"){
return 89.00;
}
if(fooditem=="fries"){
return 279.00;
}
if(fooditem=="peanuts"){
return 225.00;
}
if(fooditem=="burger"){
return 349.00;
}
if(fooditem=="soup"){
return 789.00;
}
if(fooditem=="salad"){
return 289.00 ;
}
if(fooditem=="mamos"){
return 449.00;
}
if(fooditem=="aalumasala"){
return 198.00;
}
if(fooditem=="samosa"){
return 152.00;
}
if(fooditem=="spicycorn"){
return 125.00;
}
else{
System.out.println("The item is not avaliable");
}
return 0.0;
}
public static double collectOrder(String fooditem,int quantity){
	if(fooditem=="bbq"){
	double price=0.0;
	price=169*quantity;
	return price;
}
    if(fooditem=="gobi"){
	  double price=0.0;
	  price=219*quantity;
	  return price;
}
     if(fooditem=="onionrings"){
	  double price=0.0;
	  price=229*quantity;
	  return price;
}
     if(fooditem=="cheesenachose"){
	  double price=0.0;
	  price=119*quantity;
	  return price;
}
     if(fooditem=="mushroomdry"){
	  double price=0.0;
	  price=109*quantity;
	  return price;
}
     if(fooditem=="papad"){
	  double price=0.0;
	  price=89*quantity;
	  return price;	
} 	 
     if(fooditem=="fries"){
	  double price=0.0;
	  price=279*quantity;
	  return price;
}	
    if(fooditem=="peanuts"){
	  double price=0.0;
	  price=225*quantity;
	  return price; 
}
      if(fooditem=="burger"){
	  double price=0.0;
	  price=349*quantity;
	  return price;
}
    if(fooditem=="soup"){
	  double price=0.0;
	  price=789*quantity;
	  return price;
}	  
     if(fooditem=="salad"){
	  double price=0.0;
	  price=289*quantity;
	  return price;
}	
      if(fooditem=="mamos"){
	  double price=0.0;
	  price=449*quantity;
	  return price;
}	 
      if(fooditem=="aalumasala"){
	  double price=0.0;
	  price=189*quantity;
	  return price; 
} 
      if(fooditem=="samosa"){
	  double price=0.0;
	  price=152*quantity;
	  return price;
}
     if(fooditem=="spicycorn"){
	  double price=0.0;
	  price=125*quantity;
	  return price;
	 }
	 else{
		 System.out.println("notb avalible");
		}
     return 0.0;
}
  
} 