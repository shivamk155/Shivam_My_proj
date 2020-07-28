package revision;

public class Knapsack01 {
    public static void main(String[] args) {
        int[] values = {1, 4, 5, 7};
        int[] weights = {1, 3, 4, 5};

        int sackWeight = 7;

        //int k = knapsackMaxValue(values, weights, sackWeight, values.length);

        int[][] dpArr = new int[weights.length][sackWeight + 1];
        populateDPArray(dpArr, values, weights, sackWeight);

        System.out.println("Maximum value from this knapsack is: " + dpArr[weights.length - 1][sackWeight]);
        populateElementChosenUsingDPArray(dpArr, values, weights, dpArr[weights.length - 1][sackWeight]);
    }

    public static int knapsackMaxValue(int[] values, int[] weights, int sackWeight, int length) {

        if (sackWeight == 0 || length == 0)
            return 0;

        if (weights[length - 1] > sackWeight)
            return knapsackMaxValue(values, weights, sackWeight, length - 1);

        int a = knapsackMaxValue(values, weights, sackWeight - weights[length - 1], length - 1);
        int b = knapsackMaxValue(values, weights, sackWeight, length - 1);

        return Math.max(a + values[length - 1], b);
    }

    public static void populateDPArray(int[][] dpArr, int[] values, int[] weights, int sackWeight) {

        for (int i = 0; i < weights.length; i++) {
            for (int j = 0; j < sackWeight + 1; j++) {

                if (j == 0) { //For first column only
                    dpArr[i][j] = 0;
                    continue;
                }

                if (i == 0) {    //For first row only
                    if (j >= weights[i])
                        dpArr[i][j] = values[i];
                    else
                        dpArr[i][j] = 0;
                } else {        //For rest of the rows only

                    if (j < weights[i])
                        dpArr[i][j] = dpArr[i - 1][j];
                    else
                        dpArr[i][j] = Math.max(values[i] + dpArr[i - 1][j - weights[i]], dpArr[i - 1][j]);
                }
            }
        }

    }

    public static void populateElementChosenUsingDPArray(int[][] dpArr, int[] values, int[] weights, int maxVal) {

        int i = dpArr.length - 1;
        int j = dpArr[1].length - 1;
        StringBuffer sb = new StringBuffer(" ");

        while (i > 0 && j > 0 && maxVal > 0) {
            if (dpArr[i][j] == dpArr[i - 1][j])
                i--;
            else {
                sb.append(weights[i] + " ");
                maxVal = maxVal - values[i];
                j = j - weights[i];
                i = i - 1;
            }
        }

        System.out.println("Weights chosen for this: " + sb.toString());
    }
}
