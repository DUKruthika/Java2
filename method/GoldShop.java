class GoldShop{
static String goldJewellerys[]={null,null,null,null,null,null,null};
static int index;
public static boolean addGoldJewellerys(String goldJewellery){
boolean isGoldJewlleryAdded=false;
if(goldJewellery!=null){
      goldJewellerys[index++]=goldJewellery;
	  isGoldJewlleryAdded=true;
}
return isGoldJewlleryAdded;
}
public static void getGoldJewellery(){
for(String goldJewellery:goldJewellerys)
System.out.println(goldJewellery);
}
public static boolean updateGoldJewellery(String old,String New){
	boolean isGoldJewlleryUpdated=false;
	for(int i=0;i<goldJewellerys.length;i++){
	if(old==goldJewellerys[index]){
		goldJewellerys[index]=New;
		isGoldJewlleryUpdated=true;
	}
	}
	if(isGoldJewlleryUpdated==false){
		System.out.println("old item not found");
	}
return isGoldJewlleryUpdated;
}
}