package factory.method.pattern;

public abstract class Encryptor {

	public void writeOndisk(String plainText) {
		EncryptionAlgo enAlgo = getAlgo();
		String cipherText = enAlgo.encrypt(plainText);

		System.out.println(cipherText);
	}

	public abstract EncryptionAlgo getAlgo();
}
