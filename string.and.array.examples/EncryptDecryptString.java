import java.util.Arrays;

public class EncryptDecryptString {
    public static void main(String[] args) {
        //1. Start with the first character of the original string.
        //2. In every odd step, append the next character to it.
        //3. In every even step, prepend the next character to the encrypted string so far.

        String str = "geeks";
        String str2 = "strive";
        String str3 = "geeksforgeeks";

        System.out.println("Main string is:" + str3);
        String encryptString = encrypt(str3, str3.length());
        System.out.println("Encrypted string is:" + encryptString);
        System.out.println("Original String is: " + decrypt(encryptString));
    }

    public static String encrypt(String str, int length) {
        String newStr = str.substring(0, 1);
        for (int i = 1; i < length; i++) {
            if (i % 2 == 1)
                newStr = newStr + str.substring(i, i + 1);
            else
                newStr = str.substring(i, i + 1) + newStr;

        }
        return newStr;
    }

    public static String decrypt(String str) {
        String origString = "";

        int mid = 0, left = 0, right = 0;

        if (str.length() % 2 == 0)
            mid = (str.length() / 2) - 1;
        else
            mid = str.length() / 2;

        left = mid - 1;
        right = mid + 2;

        origString = str.substring(mid, right);

        for (int i = 2; i < str.length(); i++) {
            if (i % 2 == 0)
                origString += str.charAt(left--);
            else
                origString += str.charAt(right++);
        }


        return origString;
    }

}
