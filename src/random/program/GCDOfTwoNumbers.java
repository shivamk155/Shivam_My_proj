package random.program;

public class GCDOfTwoNumbers {

    public static void main(String[] args) {
        int a = 36;
        int b = 60;
        System.out.println("GCD of 2 numbers is: " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }
}
