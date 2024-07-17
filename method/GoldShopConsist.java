class GoldShopConsist{
public static void main(String[] arg){
boolean store=GoldShop.addGoldJewellerys("Ring");
System.out.println(store);
store=GoldShop.addGoldJewellerys("Chain");
System.out.println(store);
store=GoldShop.addGoldJewellerys("Ear ring");
System.out.println(store);
store=GoldShop.addGoldJewellerys("Nose pin");
System.out.println(store);
store=GoldShop.addGoldJewellerys("Necklaces");
System.out.println(store);
store=GoldShop.addGoldJewellerys("Braslite");
System.out.println(store);
store=GoldShop.addGoldJewellerys("Bangal");
System.out.println(store);
GoldShop.getGoldJewellery();
boolean value=GoldShop.updateGoldJewellery("Ear ring","dolar");
GoldShop.getGoldJewellery();
}
}