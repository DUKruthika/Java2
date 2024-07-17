class Gym{
static String name="fit";
static String shift="morning";
static String gymEquipments[]={null,null,null,null};
static String gymTraineers[]={null,null,null,null};
static int index;
static int indexgym;
public static boolean addGymEquipments(String equipments){
boolean isGymEquipmentsAdded=false;
if(equipments!=null){
gymEquipments[index++]=equipments;
   isGymEquipmentsAdded=true;
}
return isGymEquipmentsAdded;
}
public static boolean addGymTraineers(String traineers){
boolean isGymTraineersAdded=false;
if(traineers!=null){
gymTraineers[indexgym++]=traineers;
   isGymTraineersAdded=true;
}
return isGymTraineersAdded; 
}
public static void getDetails(){
for(int i=0;i<gymEquipments.length;i++)
{
	

System.out.println("gymEquipments:"+gymEquipments[i]);
System.out.println("getTraineers:"+gymTraineers[i]);
}
return ;
}

}
