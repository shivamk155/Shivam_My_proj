import java.util.Arrays;

//For example, say there are 4 fountains with firing intervals of 2, 3, 1, and 1 respectively,
// then if they fire all together at t=0,
// when they will fire together again ?

public class MagnificientFountains {
    public static void main(String[] args) {
        int[] arr = {2, 3, 16, 241};
        Arrays.sort(arr);
        int k = arr[0];

        for (int i = 1; i < arr.length; i++)
            k = (k * arr[i]) / getGCD(k, arr[i]);

        System.out.println("The magnificent fountains will come back again after:" + k);
    }

    public static int getGCD(int a, int b) {
        if (b == 0)
            return a;

        return getGCD(b, a % b);
    }


}
