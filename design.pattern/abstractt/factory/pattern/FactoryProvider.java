package abstractt.factory.pattern;

public class FactoryProvider {

	public static AbstractFactoryAnimalDimesional getAnimalFactoryDimensional(String text) {

		if (text == "2D") {
			return new FactoryAnimal2D();
		} else if (text == "3D") {
			return new FactoryAnimal3D();
		} else
			return null;
	}
}
