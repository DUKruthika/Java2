class Shampoo{
     String brand;
	 int id;
	 String type;
	 double  price;
public  boolean washingHairs(String brand,int id,String type,double price){
	boolean isHairWashed=false;
	if( brand!=null && id>0 && type!=null && price>0.0){
		this.brand=brand;
	    this.id=id;
		this.type=type;
		this.price=price;
		isHairWashed=true;
	}
  return isHairWashed;
}
  public void getShampoos(){
	System.out.println("the brand name is:"+this.brand);
	System.out.println("the brand id is:"+this.id);
	System.out.println("the brand type is:"+this.type);
	System.out.println("the brand price is:"+this.price);
}
}

