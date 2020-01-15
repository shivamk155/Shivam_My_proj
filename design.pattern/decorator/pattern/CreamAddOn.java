package decorator.pattern;

public class CreamAddOn extends AddOn{

	
	public CreamAddOn(Beverage b){
		super(b);
	}
	
	@Override
	public int cost() {
		return this.beverage.cost() + 2;
	}
	

}
