package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {100, 90, 80, 85, 70, 50, 40};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r - 1) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int firstSize = mid - l + 1;
        int secondSize = r - mid;

        int[] tempFirst = new int[firstSize];
        int[] tempSecond = new int[secondSize];

        for (int i = 0; i < firstSize; i++)
            tempFirst[i] = arr[l + i];

        for (int i = 0; i < secondSize; i++)
            tempSecond[i] = arr[mid + 1 + i];

        int i = 0;
        int j = 0;
        int k = l;

        while (i < firstSize && j < secondSize) {
            if (tempFirst[i] < tempSecond[j]) {
                arr[k] = tempFirst[i];
                i++;
            } else {
                arr[k] = tempSecond[j];
                j++;
            }
            k++;
        }

        while (j < secondSize) {
            arr[k] = tempSecond[j];
            j++;
            k++;
        }

        while (i < firstSize) {
            arr[k] = tempFirst[i];
            i++;
            k++;
        }

    }

    public static void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }
}
