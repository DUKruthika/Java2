class ClothStore{
static String materials[]={null,null,null,null,null,null,null,null};
static int index;
public static boolean addMaterials(String material){
boolean isMaterialsAdded=false;
if(material!=null){
  materials[index]=material;
  index++;
  isMaterialsAdded=true;
}
return isMaterialsAdded;
}
public static void getMaterial(){
for(String material:materials)
System.out.println(material);
}
public static boolean updateMaterial(String old,String New){
boolean isMaterialUpdated=false;
for(int i=0;i<materials.length;i++){
if(old==materials[index]){
materials[index]=New;
isMaterialUpdated=true;
}
}
public static boolean findName(String name){
	boolean isNameFinded=false;
	for(int i=0;i<Materals.length;i++){
		if(old==materials[index]){
			materals[index]=new;
			isNameFinded=true;
		}
	}
}
if(isMaterialUpdated==false){
System.out.println("provide proper input");
}
return isMaterialUpdated;
}
} 
