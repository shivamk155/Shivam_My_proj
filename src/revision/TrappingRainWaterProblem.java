package revision;

public class TrappingRainWaterProblem {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 6, 1, 2, 10, 6, 6, 6};
        int totalWater = 0;
        int backupWater = 0;
        int currHigh = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[currHigh]) {
                totalWater += arr[currHigh] - arr[i];
                backupWater += arr[currHigh] - arr[i];

            } else {
                currHigh = i;
                backupWater = 0;
            }
        }

        totalWater -= backupWater;
        if (currHigh != arr.length - 1) {
            int tempHigh = arr.length - 1;
            for (int i = arr.length - 2; i > currHigh; i--) {

                if (arr[i] < arr[tempHigh])
                    totalWater += arr[tempHigh] - arr[i];
                else
                    tempHigh = i;
            }
        }

        System.out.println("Total rainwater accumalated is:" + totalWater);
    }
}
