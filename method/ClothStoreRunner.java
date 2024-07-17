class ClothStoreRunner{
public static void main(String[] fashion){
boolean value=ClothStore.addMaterials("cotton");
System.out.println(value);
value=ClothStore.addMaterials("Silk");
System.out.println(value);
value=ClothStore.addMaterials("Nylon");
System.out.println(value);
value=ClothStore.addMaterials("SilkCotton");
System.out.println(value);
value=ClothStore.addMaterials("polistor");
System.out.println(value);
value=ClothStore.addMaterials("neted");
System.out.println(value);
value=ClothStore.addMaterials("velvet");
ClothStore.getMaterial();
boolean Last=ClothStore.updateMaterial("Silk","khadhi");
System.out.println(Last);
ClothStore.getMaterial();
}
}