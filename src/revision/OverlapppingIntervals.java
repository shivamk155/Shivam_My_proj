package revision;

import java.util.Arrays;
import java.util.Comparator;

public class OverlapppingIntervals {
    public static void main(String[] args) {
        //int[] arr = {1, 3, 2, 4, 6, 8, 9, 10};
        int[] arr = {6, 8, 1, 9, 2, 4, 4, 7};
        Interval[] arrIn = new Interval[arr.length / 2];

        for (int i = 0, j = 0; i < arr.length; i = i + 2, j++)
            arrIn[j] = new Interval(arr[i], arr[i + 1]);

        Comparator<Interval> com = new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start == o2.start)
                    return o1.finish - o2.finish;
                else
                    return o1.start - o2.start;
            }
        };

        Arrays.sort(arrIn, com);

        for (int i = 1; i < arrIn.length; i++) {
            if (arrIn[i - 1].start <= arrIn[i].start && arrIn[i].start <= arrIn[i - 1].finish) {
                arrIn[i].start = arrIn[i - 1].start;
                arrIn[i].finish = arrIn[i - 1].finish > arrIn[i].finish ? arrIn[i - 1].finish : arrIn[i].finish;
                arrIn[i - 1] = null;
            }
        }

        System.out.println("The crushed intervals are :");
        for (int i = 0; i < arrIn.length; i++)
            if (null != arrIn[i])
                System.out.println(arrIn[i].start + "--" + arrIn[i].finish);


    }

    static class Interval {
        int start;
        int finish;

        Interval(int s, int f) {
            start = s;
            finish = f;
        }
    }


}
