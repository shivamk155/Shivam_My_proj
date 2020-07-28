import java.util.*;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        int[] arr = new int[256];
        String str = "geeksforgeeks";
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)] == 0) {
                newStr=newStr.concat(String.valueOf(str.charAt(i)));
                arr[str.charAt(i)]++;
            }
        }
        System.out.println("New string is :" + newStr);

         }

}
