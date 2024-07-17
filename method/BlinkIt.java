class BlinkIt{

public static double menuList(String delivery){

	if(delivery=="Lays"){
        return 50.00;
   }
   if(delivery=="Oats"){
        return 670.00;
   }
   if(delivery=="Munchies"){
        return 50.00;
   }
   if(delivery=="Oil"){
        return 219.00;
   }
   if(delivery=="Detergent"){
        return 48.00;
   }
   if(delivery=="Pedigree"){
        return 710.00;
   }
   if(delivery=="Maggie"){
        return 80.00;
   }
    if(delivery=="Atta"){
        return 520.00;
   }
   if(delivery=="Sauces"){
        return 15.00;
   }
   if(delivery=="Cofsils"){
        return 50.00;
   }
   if(delivery=="Lemon Juice"){
        return 90.00;
   }
   if(delivery=="Himalaya Soap"){
        return 80.00;
   }
   if(delivery=="Dettol"){
        return 100.00;
   }
   if(delivery=="Shampoo"){
        return 20.00;
   }
   if(delivery=="Boost"){
        return 300.00;
   }else{
   System.out.println(delivery + "Not found");
   
   }
   return 0.0;

}
public static double menuList(String delivery,int counts){
	if(delivery=="Lays"){
		double price=0.0;
		price=50*counts;
		return price;
	}
	if(delivery=="Oats"){
		double price=0.0;
		price=670*counts;
		return price;
	}
	if(delivery=="Munchies"){
		double price=0.0;
		price=50*counts;
		return price;
	}
	if(delivery=="Oil"){
		double price=0.0;
		price=219*counts;
		return price;
	}
	if(delivery=="Detergent"){
		double price=0.0;
		price=48*counts;
		return price;

}
     else{
		 System.out.println("item not found");
	 }
      
    return 0.0; 
}
}