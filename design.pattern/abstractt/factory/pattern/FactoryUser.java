package abstractt.factory.pattern;

public class FactoryUser {
	
	public static void main(String args[]){
		String txt = "hi Shivam";
		AbstractFactoryAnimalDimesional abstractFactoryAnimalDimesional = FactoryProvider.getAnimalFactoryDimensional("3D");
		Cat cat = abstractFactoryAnimalDimesional.getCatDimensional();
		cat.drawCat(txt);
		
		Dog dog = abstractFactoryAnimalDimesional.getDogDimensional();
		dog.drawDog(txt);
		
		
		
	}

}
