class Swiggy{

public static double takeOrder(String fooditems){
   if(fooditems=="Pizza"){
        return 149.00;
   }
    if(fooditems=="Burger"){
        return 250.00;
   }   
   if(fooditems=="Gobi"){
        return 45.00;
   }
   if(fooditems=="Sandwich"){
        return  50.00 ;
   }
   if(fooditems=="Puffs"){
        return  55.00 ;
   }
   if(fooditems=="Fries"){
        return  70.00 ;
   }
   if(fooditems=="Milk Shake"){
        return  80.00 ;
   }
   if(fooditems=="Nuggets"){
        return 90.00  ;
   }
   if(fooditems=="Cake"){
   	   return 60.00  ;
   }
   
   if(fooditems=="Lassi"){ 
		return 48.00;
   }
   if(fooditems=="Strawbery Punch"){
        return 200.00  ;
   }
   if(fooditems=="Veg roll"){
        return 100.00;
   }
   if(fooditems=="Momos"){
        return  75.0;
   }
   if(fooditems=="Potato Chips"){
        return  30.00;
   }
   if(fooditems=="Samosa"){
        return   99.00;
   }
   else{
   System.out.println(fooditems + "Not found");
   
   }
   return 0.0;
}
 public static double takeOrder(String fooditems,int quantity){
	 if(fooditems=="Pizza"){
	 double price=0.0;
	 price=149*quantity;
	 return price;
 }
     if(fooditems=="Burger"){
	 double price=0.0;
	 price=250*quantity;
	 return price;
} 
    if(fooditems=="Gobi"){
	 double price=0.0;
	 price=45*quantity;
	 return price;
} 
    if(fooditems=="Sandwich"){
	 double price=0.0;
	 price=50*quantity;
	 return price;
} 
 else{
	 System.out.println("not avalible" );
 }
 return 0.0;
}
}