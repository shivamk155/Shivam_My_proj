package factory.method.pattern;

public class SHA512EncryptionAlgo implements EncryptionAlgo {

	public String encrypt(String plainText) {

		return 512 + plainText;
	}

}
