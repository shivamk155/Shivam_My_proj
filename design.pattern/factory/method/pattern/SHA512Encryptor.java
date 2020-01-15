package factory.method.pattern;

public class SHA512Encryptor extends Encryptor {

	@Override
	public EncryptionAlgo getAlgo() {
		return new SHA512EncryptionAlgo();
	}
}
