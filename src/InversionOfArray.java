import java.util.Arrays;

public class InversionOfArray {

    //Inversion of an array
    public static void main(String[] args) {
        //int arr2[] = {3, 1, 2};         //2
        //int arr3[] = {2, 4, 1, 3, 5};      //3
        //int arr[]  = {8, 4, 2, 1};       //6
        //int[] arr = {10, 1, 5, 4, 9, 3, 7};

        int[] arr = {1, 20, 6, 4, 5};
        System.out.println("Original array is: " + Arrays.toString(arr));

        int inversionCount = mergeSort(arr, 0, arr.length - 1);
        System.out.println("Inversion count of array is: " + inversionCount);
    }

    public static int mergeSort(int[] arr, int i, int j) {
        if (i < j) {
            int mid = i + ((j - i) / 2);
            int leftInversion = mergeSort(arr, i, mid);
            int rightInversion = mergeSort(arr, mid + 1, j);

            return leftInversion + rightInversion + merge(arr, i, mid, j);
        }

        return 0;
    }

    public static int merge(int[] arr, int left, int mid, int right) {

        int inversionCount = 0;

        int x = 0, y = 0, i = left;

        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        int[] newLeftArr = new int[leftSize];
        int[] newRightArr = new int[rightSize];

        for (int j = 0; j < leftSize; j++)
            newLeftArr[j] = arr[left + j];

        for (int j = 0; j < rightSize; j++)
            newRightArr[j] = arr[mid + 1 + j];


        while (x < leftSize && y < rightSize) {
            if (newLeftArr[x] <= newRightArr[y]) {
                arr[i] = newLeftArr[x];
                x++;
            } else {
                arr[i] = newRightArr[y];
                inversionCount = inversionCount + (leftSize - x);
                y++;
            }
            i++;
        }

        while (x < newLeftArr.length) {
            arr[i] = newLeftArr[x];
            i++;
            x++;
        }

        while (y < newRightArr.length) {
            arr[i] = newRightArr[y];
            i++;
            y++;
        }

        return inversionCount;
    }

}


