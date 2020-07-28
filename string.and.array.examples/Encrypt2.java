public class Encrypt2 {
    public static void main(String[] args) {
       //if occurrence is even then add else odd of x into character.
        String str = "abbzz";
        int x = 3;
        int arr[] = new int[256];

        for (int i = 0; i < str.length(); i++)
            arr[str.charAt(i)]++;

        String encryptedString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = ' ';
            if (arr[str.charAt(i)] % 2 == 0) {
                int k = (x % 26) + str.charAt(i);
                if (k > 122) {
                    ch = (char) (k - 122 + 96);
                } else {
                    ch = (char) k;
                }
            } else {
                int k = str.charAt(i) - (x % 26);
                if (k < 97) {
                    ch = (char) (122 + k - 96);
                } else {
                    ch = (char) k;
                }
            }

            encryptedString += String.valueOf(ch);
        }

        System.out.println("encrypted string is:" + encryptedString);
    }
}
