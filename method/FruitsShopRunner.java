class FruitsShopRunner{
public static void main(String[] name)
{
boolean value=FruitsShop.addFruitsName("Apple");
System.out.println("the fruit name is:"+value);
boolean price=FruitsShop.addFruitsPrice(50);
System.out.println("the amount is:"+price);
 value=FruitsShop.addFruitsName("Banana");
System.out.println("the fruit name is:"+value);
 price=FruitsShop.addFruitsPrice(40);
System.out.println("the amount is:"+price);
 value=FruitsShop.addFruitsName("Mango");
System.out.println("the fruit name is:"+value);
 price=FruitsShop.addFruitsPrice(70);
System.out.println("the amount is:"+price);
 value=FruitsShop.addFruitsName("Chiku");
System.out.println("the fruit name is:"+value);
 price=FruitsShop.addFruitsPrice(70);
System.out.println("the amount is:"+price);
 value=FruitsShop.addFruitsName("Orange");
System.out.println("the fruit name is:"+value);
price=FruitsShop.addFruitsPrice(30);
System.out.println("the amount is:"+price);
FruitsShop.getFruitsName();
FruitsShop.getFruitsPrice();
boolean fin=FruitsShop.updateFruitsName("Apple","watermelon");
System.out.println(fin);
FruitsShop.getFruitsName();

}
}