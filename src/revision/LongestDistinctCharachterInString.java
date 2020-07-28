package revision;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestDistinctCharachterInString {
    public static void main(String[] args) {
        String str = args[0]; //"aldshflasghdfasgfkhgasdfasdgvfyweofyewyrtyefgv"; //"abababcdefababcdab"; //"geeksforgeeks";
        int maxLength = Integer.MIN_VALUE;
        int currlength = 0;

        //Can also be done by using array of all characters instead of set.
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.charAt(i))) {
                set.clear();
                set.add(str.charAt(i));
                currlength = 1;
            } else {
                set.add(str.charAt(i));
                currlength++;
                if (currlength > maxLength)
                    maxLength = currlength;
            }
        }

        System.out.println("Length of maximum distinct character is: " + maxLength);
    }
}
