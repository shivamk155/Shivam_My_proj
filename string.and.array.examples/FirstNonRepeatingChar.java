
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int k = getFirstNonRepChar(str);

        System.out.println(str.charAt(k));
    }

    public static int getFirstNonRepChar(String str) {
        CountIndex[] arr = new CountIndex[256];

        for (int i = 0; i < str.length(); i++) {
            if (null == arr[str.charAt(i)])
                arr[str.charAt(i)] = new CountIndex(i);
            else
                arr[str.charAt(i)].incCount();
        }

        for (int i = 0; i < str.length(); i++)
            if (arr[str.charAt(i)].frequency == 1)
                return arr[str.charAt(i)].firstIndex;


        return -1;
    }
}
