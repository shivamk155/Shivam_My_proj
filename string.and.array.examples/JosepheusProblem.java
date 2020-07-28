import java.util.HashMap;
import java.util.Map;

public class JosepheusProblem {
    public static void main(String[] args) {
        int n = 11;
        int k = 4;

        boolean b = "shivam".contains("a");
        Map<Integer, Integer> m = new HashMap<>();

        System.out.println("last place to go down is" + josepheus(n, k));
    }

    public static int josepheus(int n, int k) {
        if (n == 1)
            return 1;

        return (josepheus(n - 1, k) + k - 1) % n + 1;
    }
}
