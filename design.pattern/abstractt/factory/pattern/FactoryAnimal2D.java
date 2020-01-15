package abstractt.factory.pattern;

public class FactoryAnimal2D implements AbstractFactoryAnimalDimesional {

	public Cat getCatDimensional() {
		return new Cat2D();
	}

	public Dog getDogDimensional() {
		return new Dog2D();
	}
}
