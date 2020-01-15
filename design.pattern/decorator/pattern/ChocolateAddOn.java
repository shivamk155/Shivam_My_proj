package decorator.pattern;

public class ChocolateAddOn extends AddOn {

	@Override
	public int cost() {
		return this.beverage.cost() + 3;
	}

	public ChocolateAddOn(Beverage beverage) {
		super(beverage);
	}

}
