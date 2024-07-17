class FruitsShop{
  static String name="om";
  static String area="Bangalore";
  static String fruitNames[]={null,null,null,null,null};
  static double fruitsPrices[]={0.0,0.0,0.0,0.0,0.0,0.0};
  static int index;
  static int indexPrice;
  public static boolean addFruitsName(String fruitName) {
  boolean isFruitsNameadded=false;
  if(index<=fruitNames.length){
  if(fruitName!=null){
            fruitNames[index++]=fruitName;
			 isFruitsNameadded=true;
  }

  }
  else{
	  System.out.println("Array is full");
  }
  return isFruitsNameadded;
  }
  public static boolean addFruitsPrice(double fruitPrice){
	  boolean isFruitsPriceAdded=false;
	  if(fruitPrice>0.0){
		  fruitsPrices[indexPrice++]=fruitPrice;
		  isFruitsPriceAdded=true;
  }
  return isFruitsPriceAdded;
}
  public static void getFruitsName(){
  for( String fruitName:fruitNames)
         System.out.println(fruitName);
  }
  
 public static void getFruitsPrice(){
	  for(double fruitPrice:fruitsPrices)
		  System.out.println(fruitPrice);
		  
	  }
   public static boolean updateFruitsName(String oldname,String newname){
	   boolean isFruitsNameUpdated=false;
	   for(int index=0;index<fruitNames.length;index++){
		   if(oldname==fruitNames[index]){
			   fruitNames[index]=newname;
			   isFruitsNameUpdated=true;
		   }
	   }
	   if(isFruitsNameUpdated==false){
		   System.out.println(oldname+" not found");
	   }
  return isFruitsNameUpdated;
}
}

  
  