class RedChilliesEntertainment {
static String movieActors[] = {null, null, null, null, null, null, null, null, null,null};
static int index = 0;
public static boolean addMovieActors(String actorName){	
boolean isActorAdded = false;
if(actorName != null){
	movieActors[index] = actorName;
	index++;
	isActorAdded = true;
}
else {
    System.out.println("Invalid actor name Added");
}	
return isActorAdded;
}
public static void getMovieActors(){
System.out.println("The movie actors available are:");
for(String actor : movieActors){
if(actor != null){
System.out.println(actor);
}		
}
}
}
