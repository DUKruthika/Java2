class GymFit{
public static void main(String[] fitness){
   boolean value=Gym.addGymEquipments("TreadMill");
  System.out.println("is Equipment added:"+value);
   boolean name=Gym.addGymTraineers("Bhuvan");
  System.out.println("is trainer added:"+name); 
  value =Gym.addGymEquipments("Oddish");
    System.out.println("is Equipment added:"+value);
    name=Gym.addGymTraineers("Gagan");
     System.out.println("is trainer added:"+name);
     value=Gym.addGymEquipments("Leg press");
     System.out.println("is Equipment added:"+value);
    name=Gym.addGymTraineers("Bharath");
   System.out.println("is trainer added:"+name); 
   value=Gym.addGymEquipments("Dambols");
   System.out.println("is Equipment added:"+value);
  name=Gym.addGymTraineers("Tejas");
  System.out.println("is trainer added:"+name);
  Gym.getDetails(); 
}
}