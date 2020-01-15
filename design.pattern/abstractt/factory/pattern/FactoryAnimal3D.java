package abstractt.factory.pattern;

public class FactoryAnimal3D implements AbstractFactoryAnimalDimesional {

	public Cat getCatDimensional() {
		return new Cat3D();
	}

	public Dog getDogDimensional() {
		return new Dog3D();
	}
}
