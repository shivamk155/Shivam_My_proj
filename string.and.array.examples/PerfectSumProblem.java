public class PerfectSumProblem {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5}; //{ 2, 5, 8, 4, 6, 11 }; //{2, 3, 5, 6, 8, 10};
        int sum = 10; //13; //10;

        printSubsetsForTheSum(0, sum, arr.length, arr, "");
    }

    public static void printSubsetsForTheSum(int i, int sum, int length, int[] arr, String str) {
        if (sum == 0) {
            System.out.println("one of the subsets is: " + str);
            return;
        }

        if (i >= length)
            return;

        printSubsetsForTheSum(i + 1, sum - arr[i], length, arr, str + " " + arr[i]);
        printSubsetsForTheSum(i + 1, sum, length, arr, str);
    }
}
