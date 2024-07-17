class AirConditioner{
static boolean isConnected=false;
static int currentVolume;
static int maximumVolume=12;
public static void onOrOff(){
//if(isConnected==false){
	//isConnected=true;
	if(!isConnected) ? isConnected=true:isConnected=false;
//System.out.println("the AC is on");
//else if(isConnected==true){
//isConnected=false;
//System.out.println("the AC is off");
//return;
}
public static void toGetFeatures(){
String name="vguard";
double price=5000.0;
System.out.println("the name is:"+name);
System.out.println("the price is:"+price);
return;
}
public static void increasedVolume(){
if(isConnected==true){
if(currentVolume<maximumVolume){
currentVolume=currentVolume+1;
System.out.println("the volume has to  be high"+currentVolume);
}
else{
System.out.println("the volume is increased");
return;
}
}
}
}