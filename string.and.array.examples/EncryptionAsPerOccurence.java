public class EncryptionAsPerOccurence {
    public static void main(String[] args) {
        String encryptStr = "geeeeekkkksssss";
        String str = "";
        int k = 0;
        while (k < encryptStr.length()) {
            str += encryptStr.charAt(k);
            k = k + ++k;

        }
        System.out.println("Decrypted string is:" + str);
    }
}
