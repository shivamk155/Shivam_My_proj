package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr =  {6, 1, 4, 3, 2, 9, 5};// {10, 7, 8, 9, 1, 5};// {100, 90, 80, 85, 70, 50, 45};
        int low = 0;
        int high = arr.length - 1;
        quicksort(arr, low, high);
        System.out.println("Sorted array is:" + Arrays.toString(arr));

    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {

        int temp = low;
        int var;
        for (int i = low; i < high; i++) {
            if (arr[i] < arr[high]) {
                var = arr[temp];
                arr[temp] = arr[i];
                arr[i] = var;
                temp++;
            }
        }

        var = arr[temp];
        arr[temp] = arr[high];
        arr[high] = var;

        return temp;
    }
}
