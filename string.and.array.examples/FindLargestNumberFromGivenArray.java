import java.util.*;

public class FindLargestNumberFromGivenArray {
    public static void main(String[] args) {
        int[] arr = {1, 34, 3, 98, 9, 76, 45, 4, 12, 121};
        System.out.println(Arrays.toString(arr));
        List<String> list = new ArrayList<String>(arr.length);

        for (int i : arr) {
            list.add(String.valueOf(i));
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2; //O1 = 98 & O2= 9;
                String s2 = o2 + o1;
                if (Integer.valueOf(s1) > Integer.valueOf(s2)) {
                    return -1;
                } else
                    return 1;
            }
        });
        Iterator it = list.iterator();

        while(it.hasNext())
            System.out.print(it.next());
    }
}
