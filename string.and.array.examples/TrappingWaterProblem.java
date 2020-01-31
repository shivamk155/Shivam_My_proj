public class TrappingWaterProblem {
    public static void main(String[] args) {

        //int[] arr = {1, 0, 3, 0, 0, 2, 0, 4, 0, 1};
        //int[] arr = {1, 0, 3, 0, 0, 2, 0, 4};
        //int[] arr = {3, 0, 0, 2, 0, 4};
        int[] arr = {3, 0, 4};
        int waterAmount = 0;

        waterAmount = calculateTrappedWater(arr, 0, arr.length - 1, waterAmount);
        System.out.println("Total trapped water is : " + waterAmount);
    }

    public static int calculateTrappedWater(int[] arr, int start, int end, int waterAmount) {
        int endArrIndex = arr.length - 1;
        int maxIndex = findMaximum(arr, start, end);
        int secondMaxIndex = findSecondMaximum(arr, start, end, maxIndex);

        waterAmount = waterAmount + findWaterBetweenIndex(arr, secondMaxIndex, maxIndex);

        if ((maxIndex == end && secondMaxIndex == start) || (maxIndex == start && secondMaxIndex == end))
            return waterAmount;


        if (maxIndex > secondMaxIndex) {
            if (maxIndex != endArrIndex && secondMaxIndex != 0) {
                waterAmount = calculateTrappedWater(arr, start, secondMaxIndex, waterAmount);
                waterAmount = calculateTrappedWater(arr, maxIndex, end, waterAmount);

            } else if (maxIndex == endArrIndex) {
                waterAmount = calculateTrappedWater(arr, start, secondMaxIndex, waterAmount);
            } else if (secondMaxIndex == 0) {
                waterAmount = calculateTrappedWater(arr, maxIndex, end, waterAmount);
            }

        } else {
            if (secondMaxIndex != endArrIndex && maxIndex != 0) {
                waterAmount = calculateTrappedWater(arr, start, maxIndex, waterAmount);
                waterAmount = calculateTrappedWater(arr, secondMaxIndex, end, waterAmount);

            } else if (secondMaxIndex == endArrIndex) {
                waterAmount = calculateTrappedWater(arr, start, maxIndex, waterAmount);
            } else if (maxIndex == 0) {
                waterAmount = calculateTrappedWater(arr, secondMaxIndex, end, waterAmount);
            }
        }

        return waterAmount;
    }

    public static int findWaterBetweenIndex(int[] arr, int secondMaxIndex, int maxIndex) {
        int totalWater = 0;
        if (maxIndex == secondMaxIndex) {
            return totalWater;
        }

        if (maxIndex > secondMaxIndex) {
            for (int i = secondMaxIndex + 1; i < maxIndex; i++) {
                totalWater = totalWater + arr[secondMaxIndex] - arr[i];
            }
        } else {
            for (int i = maxIndex + 1; i < secondMaxIndex; i++) {
                totalWater = totalWater + arr[secondMaxIndex] - arr[i];
            }
        }
        return totalWater;
    }

    public static int findMaximum(int[] arr, int start, int end) {
        int max = Integer.MIN_VALUE, maxindex = -1;
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxindex = i;
            }
        }
        return maxindex;
    }

    public static int findSecondMaximum(int[] arr, int start, int end, int maxIndex) {
        int secondMax = Integer.MIN_VALUE, secondMaxindex = -1;
        for (int i = start; i <= end; i++) {
            if (arr[i] > secondMax && arr[i] < arr[maxIndex]) {
                secondMax = arr[i];
                secondMaxindex = i;
            }
        }
        return secondMaxindex;
    }

}
