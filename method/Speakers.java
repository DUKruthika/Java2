class Speakers{
static boolean isLinked=false;
static int currentVolume;
static int miniVolume;
static int maxVolume=6;
public static void onOrOff(){
System.out.println("started");
if(isLinked==false){
isLinked=true;
System.out.println("the speaker is turned on");
}
else if(isLinked==true){
isLinked=false;
System.out.println("the speakers turned off");
}
System.out.println("Ended");
return;
}
public static void increaseVolume(){
	if(isLinked==true){
		if(currentVolume<maxVolume){
			currentVolume=currentVolume+1;

			System.out.println("the volume increase to:"+currentVolume);
		}
			else {
				System.out.println("the volume is maximum");
				return;
			}
		}
	}
public static void decreaseVolume(){
	if(isLinked==true){
		if(currentVolume>miniVolume){
			System.out.println("the current volume is:"+currentVolume);
			currentVolume=currentVolume-1;
			System.out.println("the volume is low:"+currentVolume);
		}
			else{
				System.out.println("the volume is minimum");
				return;
			}
		}
	}

public static void getDetails(){
System.out.println("getDetails started");
String name="jbl";
double cost=4800.0;
String colour="Black";
System.out.println("the brand name is:"+name);
System.out.println("the cost is"+cost);
System.out.println("the coloue is:"+colour);
System.out.println("getDetails ended");
}
}
