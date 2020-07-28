package revision;

import java.util.HashMap;
import java.util.Map;

public class CountPairWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1}; //{1, 1, 1, 1};
        int k = 6;
        int sumCount = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < k) {
                if (map.containsKey(k - arr[i]))
                    sumCount += map.get(k - arr[i]);

                if (map.containsKey(arr[i]))
                    map.put(arr[i], map.get(arr[i]) + 1);
                else
                    map.put(arr[i], 1);
            }
        }

        System.out.println("Count of pairs with given sum: " + sumCount);
    }
}
