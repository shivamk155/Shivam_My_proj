package revision;

import java.util.HashMap;
import java.util.Map;

public class FrequencyGame {
    public static void main(String[] args) {
        int[] arr = {605, 3602, 7398, 9120, 4453, 7711, 9204,
                5274, 3833, 9436, 4257, 3797, 5009, 1042, 1749, 183, 7152, 5078, 9152, 7779, 5754,
                1457, 6728, 834, 2900, 7504, 3668, 7700, 6443, 2220, 9977, 6664, 856, 140, 7970,
                3242, 5187, 5402, 2870, 2045, 2421, 1588, 1429, 4810, 7554, 3940, 5954, 1543, 182,
                2274, 5864, 4235, 1695, 1815, 1366, 8833, 5820, 1366, 2668, 2348, 1796,
                3239, 5723, 8458, 4650, 8851, 3176, 635, 2464, 6551, 7969, 7395, 2170, 7874, 6739};

        LargButMinFreq(arr, arr.length);

    }

    public static int LargButMinFreq(int arr[], int n) {
        int thatElement = 0;
        int frequency = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (null == map.get(arr[i]))
                map.put(arr[i], 1);
            else
                map.put(arr[i], map.get(arr[i]) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() < frequency) {
                frequency = entry.getValue();
                thatElement = entry.getKey();
            } else if (entry.getValue() == frequency && entry.getKey() > thatElement)
                thatElement = entry.getKey();
        }

        return thatElement;
    }

}
