package revision;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ManyMeetingsOneRoom {
    public static void main(String[] args) {
        //int s[] = {1, 3, 0, 5, 8, 5};
        //int f[] = {2, 4, 6, 7, 9, 9};

        int[] s = {12, 2, 3, 4, 7, 8, 9, 9, 11, 1};
        int[] f = {14, 5, 4, 7, 10, 9, 11, 13, 12, 3};

        StringBuffer sb = new StringBuffer("");

        Map<Integer, Integer> meetingMap = new TreeMap<>();

        for (int i = 0; i < s.length; i++)
            meetingMap.put(f[i], s[i]);

        boolean first = false;
        int end = 0;

        for (Map.Entry<Integer, Integer> entry : meetingMap.entrySet()) {
            if (!first) {
                first = true;
                sb.append(entry.getValue()+ "-" + entry.getKey() + ",");
                end = entry.getKey();
            } else {
                if (entry.getValue() >= end) {
                    sb.append(entry.getValue()+ "-" + entry.getKey() + ",");
                    end = entry.getKey();
                }
            }
        }

        System.out.println("List of meetings are:" + sb.toString());

    }
}
