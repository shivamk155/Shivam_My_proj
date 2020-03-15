import java.util.Arrays;

public class SortArrayOf012s {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 0, 1, 2, 2, 0, 1, 0, 2, 0};
        System.out.println(""+ Arrays.toString(arr));
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int n = arr.length;
        int temp;

        while (mid < high) {
            switch (arr[mid]) {
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    low++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;
                    break;
            }
        }
    System.out.println(""+ Arrays.toString(arr));
    }

}
