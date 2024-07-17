class FoodPanda{

public static double takeOrder(String fooditems){
   if(fooditems=="Chicken Roll"){
        return 50.00;
   }
    if(fooditems=="Milky Bread"){
        return 70.00;
   }   
   if(fooditems=="Burger"){
        return 200.00;
   }
   if(fooditems=="Fried Chicken"){
        return  300.00 ;
   }
   if(fooditems=="Popcorn"){
        return  140.00 ;
   }
   if(fooditems=="Chicken Sandwich"){
        return  80.00 ;
   }
   if(fooditems=="masala chai"){
        return  80.00 ;
   }
   if(fooditems=="Nuggets"){
        return 90.00  ;
   }
   if(fooditems=="Cake"){
        return 60.00  ;
   }
   if(fooditems=="Lassi"){
        return  120.00 ;
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
	  if(fooditems=="Chicken Roll"){
		  double price=0.0;
		  price=50*quantity;
		  return price;
	  }
	     if(fooditems=="Milky Bread"){
		  double price=0.0;
		  price=70*quantity;
		  return price;
	  }
	  if(fooditems=="Burger"){
		  double price=0.0;
		  price=200*quantity;
		  return price;
	  }
	  if(fooditems=="Fried Chicken"){
		  double price=0.0;
		  price=300*quantity;
		  return price;
   }
      else{
		  System.out.println("the item is not found");
	 	 } 
  return 0.0;
} 
} 

   
  
 