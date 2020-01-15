package random.program;

public class CheckReferrence {

	public static void main(String[] args) {
		Apple apple = new Apple();
		System.out.println(apple.color);
		changeApple(apple);
		System.out.println(apple.color);
	}

	public static void changeApple(Apple apple) {
		Apple a = new Apple("purple");
		apple = a;
	}
}

class Apple {
	public Apple(String color){
		this.color = color;
	}
	public Apple() {
		this.color = "red";
	}
	public String color = "red";
}
