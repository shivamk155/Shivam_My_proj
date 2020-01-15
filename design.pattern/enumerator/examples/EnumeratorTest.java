package enumerator.examples;

public class EnumeratorTest {

	public static void main(String[] args){
		System.out.println(Currency.DNR.getCurrencyName());
		System.out.println(Currency.DNR.getValue());
		System.out.println(Currency.DNR.getDollarConverted());
		
		getvalue(Currency.DNR);
		getDollarvalue(Currency.DNR);
		
		System.out.println(Currency.valueOf("AUD").getDollarConverted());
	}
	
	public static void getvalue(Currency curr){
		System.out.println(curr.getValue());
	}
	
	public static void getDollarvalue(Currency curr){
		System.out.println(curr.getDollarConverted());
	}
}
