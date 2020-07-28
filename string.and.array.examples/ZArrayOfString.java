import java.util.Arrays;

public class ZArrayOfString {
    public static void main(String[] args) {
        String str = "aabxaabxcaabxaabxay";
        char[] mainArr = str.toCharArray();
        int[] arr = new int[str.length()];
        arr[0] = 0;
        populateZArray(mainArr, arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void populateZArray(char[] strArr, int[] arr) {
        int i = 1;  //for string travel;
        int j = 0;  //for string start travel
        int k = 0;  //for z value

        while (i < strArr.length) {
            if (strArr[i] == strArr[j]){
                k++;

            }

        }
    }
}
