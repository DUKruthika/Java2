class Zepto{

public static double giveList(String item){
   if(item =="Fruits"){
        return 150.00;
   }
    if(item =="Vegetables"){
        return 100.00;
   }   
   if(item =="Dry Fruits"){
        return 300.00;
   }
   if(item =="Perfume"){
        return  250.00;
   }
   if(item =="Rice"){
        return  500.00;
   }
   if(item =="Flowers"){
        return  50.00;
   }
   if(item =="Sweets"){
        return  160.00;
   }
   if(item =="Chips"){
        return 90.00;
   }
   if(item =="Makeup"){
        return 400.00;
   }
   if(item =="Biscuits"){
        return  100.00;
   }
   if(item =="Skin Care"){
        return 600.00;
   }
   if(item =="Chole"){
        return 100.00;
   }
   if(item =="Salsa"){
        return  75.0;
   }
   if(item =="Curd"){
        return  45.00;
   }
   if(item =="Sugar"){
        return   48.00;
   }
   else{
   System.out.println(item + "Not found");
   
   }
   return 0.0;
}
   public static double giveList(String item,int count){
	   if(item=="Fruits"){
		   double price=0.0;
		   price=150*count;
		   return price;
	   }
	   if(item=="Vegetables"){
		   double price=0.0;
		   price=100*count;
		   return price;
	    }
		if(item=="Dry Fruits"){
		   double price=0.0;
		   price=300*count;
		   return price;
   }
         if(item=="Perfume"){
		   double price=0.0;
		   price=250*count;
		   return price;
		 }
		 else{
			 System.out.println("no stock");
		 }
   return 0.0;
   }
}
