package revision;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KMPAlgorithm {
    public static void main(String[] args) {
        String pattern = "ABABCABAB";//"abcdabcy";
        String txt = "ABABDABACDABABCABAB"; //"abcxabcdabxabcdabcdabcy";

        int[] arr = new int[pattern.length()];
        char[] txtChrArr = pattern.toCharArray();

        populateLPSArr(txtChrArr, arr);
        System.out.println("LPS population of array:" + Arrays.toString(arr));
        StringBuffer sb = new StringBuffer("");

        int i = 0, j = 0;
        while (i < txt.length()) {
            if (txt.charAt(i) == txtChrArr[j]) {
                i++;

                if (j == txtChrArr.length - 1) {
                    sb.append(" " + (i - pattern.length()));
                    j = 0;
                } else
                    j++;
            } else {
                j = j == 0 ? 0 : arr[j - 1];
                if (j == 0)
                    i++;
            }
        }


        System.out.println("Matching text is present @ locations:" + sb.toString());
    }

    public static void populateLPSArr(char[] pattern, int[] lpsArr) {
        int i = 1, j = 0;

        while (i < pattern.length) {
            if (pattern[i] == pattern[j]) {
                lpsArr[i] = j + 1;
                j++;
            } else {
                j = 0;
                if (pattern[i] == pattern[j]) {
                    lpsArr[i] = j + 1;
                    j++;
                } else {
                    lpsArr[i] = 0;
                }
            }
            i++;
        }
    }
}
