import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingChar {

    public static void main(String[] args) {
        String s = "abcdefghb";
        Set<String> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (!set.add(String.valueOf(s.charAt(i)))) {
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
