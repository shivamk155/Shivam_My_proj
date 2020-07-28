package revision;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int k = 50;
        long[] arr = new long[k + 1];
        Arrays.fill(arr, -1);
        arr[1] = 0;
        arr[2] = 1;

        System.out.println(k + "th fibonacci number is: " + kthFibonacci(k, arr));
    }

    public static long kthFibonacci(int n, long[] arr) {
        if (n == 1 || n == 2)
            return arr[n];

        if (arr[n] != -1)
            return arr[n];

        arr[n] = kthFibonacci(n - 1, arr) + kthFibonacci(n - 2, arr);
        return arr[n];
    }


}
