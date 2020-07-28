package revision;

public class MinElementInSortedAndRotatedArray {
    public static void main(String[] args) {
        /////////////0 ,1,  2,  3,  4,  5, 6
        int[] arr = {5, 7, 10, 20, 30, 40, 50};
        boolean foundElement = false;
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;


        while (!foundElement) {
            if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                foundElement = true;
                break;
            } else if (right == left + 1) {
                mid = right;
                break;
            }


            if (arr[mid] > arr[left]) {
                left = mid;
                mid = (mid + right) / 2;
            } else if (arr[mid] < arr[left]) {
                right = mid;
                mid = (left + mid) / 2;
            }
        }

        System.out.println("Minimum element in this sorted and rotated array is: " + arr[mid]);
    }
}