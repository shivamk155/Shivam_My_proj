package factory.method.pattern;

public class SHA256Encryptor extends Encryptor {

	@Override
	public EncryptionAlgo getAlgo() {
		return new SHA256EncryptionAlgo();
	}

}
