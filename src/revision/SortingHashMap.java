package revision;

import java.util.*;

//3 ways of sorting a map
public class SortingHashMap {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("D", 10);
        map.put("A", 5);
        map.put("C", 1);
        map.put("B", 8);
        map.put("Z", 15);

        //1st way

//        List<String> list = new ArrayList(map.keySet());
//        Collections.sort(list);
//
//        System.out.println("List is:" + list);
//        System.out.println("-----------------------------------");
//        for (String i : list)
//            System.out.println(i + ", " + map.get(i));

////----------------------------------------------------------------------------------------------------------

        //2nd way
        List<Map.Entry<String, Integer>> entryList = new ArrayList(map.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        System.out.println(map);
        System.out.println(entryList);

////----------------------------------------------------------------------------------------------------------

        //3rd way
        Map<String, Integer> treeMap = new TreeMap<>();

        treeMap.putAll(map);

        System.out.println(map);
        System.out.println(treeMap);
    }
}
