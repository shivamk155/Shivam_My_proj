public class LastOneInString {

    public static  void main (String[] args) {
        String str = "00000000000000010";
        int k = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1')
                k = i;
        }
        System.out.println(k);
        System.out.println(str.lastIndexOf('1'));
    }
}
