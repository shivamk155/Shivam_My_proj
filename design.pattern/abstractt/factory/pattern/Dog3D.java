package abstractt.factory.pattern;

public class Dog3D implements Dog {

	@Override
	public void drawDog(String dogText) {
		System.out.println(dogText + "DOG in 3D");
	}

}
