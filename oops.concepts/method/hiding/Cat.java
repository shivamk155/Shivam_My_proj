package method.hiding;

public class Cat extends Animal{
	
	public static void foo() {  // hides Animal.foo()
        System.out.println("Cat");
    }

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Cat c1 = new Cat();
		Animal a2 = new Cat();
		a1.foo();
		c1.foo();
		a2.foo();

	}

}
