package revision;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {6, 1, 4, 3, 2, 9, 5};

        System.out.println("Before sorting array was: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Before sorting array was: " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int partition = partition(arr, low, high);

            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int j = low;
        for (int i = low; i < high; i++) {
            if (arr[i] < arr[high]) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }

        }
        int temp = arr[j];
        arr[j] = arr[high];
        arr[high] = temp;

        return j;
    }
}
