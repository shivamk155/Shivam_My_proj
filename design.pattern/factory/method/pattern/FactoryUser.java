package factory.method.pattern;

public class FactoryUser {

	//this Example is based on Notes in the copy and in the Dzon link 
	//https://dzone.com/articles/java-the-factory-pattern
	Encryptor encryptor;
	
	FactoryUser(Encryptor e){
		encryptor =e;
	}
	
	public static void main(String[] args) {
		System.out.println();
		FactoryUser f = new FactoryUser(new SHA512Encryptor());
		f.display("shivam");
		
	}
	
	public void display(String testString){
		encryptor.writeOndisk(testString);
	}
	
	

}
