package decorator.pattern;

public class AddOn implements Beverage {

	protected Beverage beverage;

	public AddOn(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public int cost() {
		return 1000000000;
	}
	
}
