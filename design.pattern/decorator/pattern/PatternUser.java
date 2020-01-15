package decorator.pattern;

public class PatternUser {

	public static void main(String[] args) {
		Beverage beverage = new ChocolateAddOn(new Espresso());
		System.out.println(new MilkAddOn(new MilkAddOn(new MilkAddOn(new MilkAddOn(beverage)))).cost());
	}

}
