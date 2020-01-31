import java.util.HashMap;
import java.util.Map;

public class LargestContigousSubArrayWithSum0 {

    public static void main(String[] args) {
        //int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        int[] arr = {15, 0, 0, 0, 0, 23};
        Map<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sumMap.containsKey(sum)) {
                int j = sumMap.get(sum);
                if(i-j > maxLength)
                    maxLength = i-j;
            } else {
                sumMap.put(sum, i);
            }
        }


        System.out.println("Max largest length:" + maxLength);
    }
}
