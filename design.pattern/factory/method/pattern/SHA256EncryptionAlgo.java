package factory.method.pattern;

public class SHA256EncryptionAlgo implements EncryptionAlgo {
	
	public String encrypt(String plainText){
		
		return 256+plainText;
	}

}
