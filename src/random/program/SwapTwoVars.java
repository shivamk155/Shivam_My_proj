package random.program;

import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;

public class SwapTwoVars {

    public static void main(String[] args) {
        // 0,1,1,2,3,5,8,13,21,....
        int k = 3;

        Integer[] arr = new Integer[k + 1];
        arr[0] = 0;
        arr[1] = 1;
        System.out.println(" " + 0);
        System.out.println(" " + 1);

        fibonacci(k, arr);
    }

    public static int fibonacci(int n, Integer[] arr) {

        if (null != arr[n])
            return arr[n];

        arr[n] = fibonacci(n - 1, arr) + fibonacci(n - 2, arr);
        System.out.println(" " + arr[n] + " ");

        return arr[n];
    }
}
