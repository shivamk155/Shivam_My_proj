package abstractt.factory.pattern;

public class Cat3D implements Cat {

	@Override
	public void drawCat(String catText) {
		System.out.println(catText + "CAT in 3D");
	}

}