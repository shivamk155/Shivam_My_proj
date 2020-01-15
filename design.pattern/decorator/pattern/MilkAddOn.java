package decorator.pattern;

public class MilkAddOn extends AddOn {

	@Override
	public int cost() {
		return this.beverage.cost() + 1;
	}

	public MilkAddOn(Beverage beverage) {
		super(beverage);
	}

}
