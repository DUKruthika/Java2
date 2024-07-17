class PunjabiDabba{
public static int collectOrder(String foodname){
if(foodname=="paneerTikka"){
return 210;
}
if(foodname=="dal"){
return 185 ;
}
if(foodname=="paneer butter masal"){
return 250;
}
if(foodname=="dal mirch tadka"){
return 199;
}
if(foodname=="dal makhani"){
return 255;
}
if(foodname=="hara bhara kabab"){
return  190;
}
if(foodname=="fried rice"){
return 195;
}
if(foodname=="jeera rice"){
return 225;
}
if(foodname=="veg taipuri"){
return  220;
}
if(foodname=="paneer lababdar"){
return 240;
}
if(foodname=="mushroom masala"){
return 218;
}
if(foodname=="paneer paratha"){
return 110;
}
if(foodname=="baby corn manchurian"){
return 186;
}
if(foodname=="mails"){
return 250;
}
if(foodname=="tawa pula"){
return 245;
}
if(foodname=="chole biriyani"){
return 220;
}
else{
System.out.println("The item is not avaliable");
}
return 0 ;
}
  public static int collectOrder(String foodname,int numbers){
	  if(foodname=="paneerTikka"){
		 int  price=210*numbers;
		  return price;
	  }
	  if(foodname=="dal"){
		  int price=185*numbers;
		  return price;
	  }
	  if(foodname=="paneer butter masal"){
		  int price=250*numbers;
		  return price;
	  }
	  if(foodname=="dal makhani"){
		  int price=255*numbers;
		  return price;
	  }
	  else{
		  System.out.println("item is not found");
	  }
	  return 0;
  }
}