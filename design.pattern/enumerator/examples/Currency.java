package enumerator.examples;

public enum Currency {

	SGP("SINGAPORE Dollar", 11, 0.0909), 
	USD("US Dollar", 22, 0.04545), 
	HKG("Hong Kong Dollar", 33, 0.0303), 
	DNR("Dinar", 0.44, 2.2727), 
	INR("Indian Rupee", 77, 0.01298), 
	AUD("AU Dollar", 31, 0.0322);

	private final String currencyName;
	private final double value;
	private final double dollarConverted;

	private Currency(String currencyName, double value, double dollarConverted) {
		this.currencyName = currencyName;
		this.value = value;
		this.dollarConverted = dollarConverted;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public double getValue() {
		return value;
	}

	public double getDollarConverted() {
		return dollarConverted;
	}
}
