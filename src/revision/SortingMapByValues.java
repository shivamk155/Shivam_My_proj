package revision;

import java.util.*;

public class SortingMapByValues {
    public static void main(String[] args) {

        int[] s = {12, 2, 3, 4, 7, 8, 9, 9, 11, 1};
        int[] f = {14, 5, 4, 7, 10, 9, 11, 13, 12, 3};

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length; i++)
            map.put(s[i], f[i]);

        System.out.println(map);

        List<Map.Entry<Integer, Integer>> mapList = new ArrayList<>(map.entrySet());
        Collections.sort(mapList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        System.out.println(mapList);


    }

}
