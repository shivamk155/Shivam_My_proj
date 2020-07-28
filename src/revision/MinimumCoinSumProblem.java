package revision;

public class MinimumCoinSumProblem {
    //Given a value V, if we want to make change for V cents,
    //and we have infinite supply of each of C = { C1, C2, .. , Cm} valued coins,
    //what is the minimum number of coins to make the change..?

    public static void main(String[] args) {
        int[] c = {9, 6, 5, 1};
        int v = 31;
        int[] arr = new int[v];
        for (int i = 1; i < arr.length; i++)
            arr[i] = Integer.MAX_VALUE;

        //StringBuffer str = new StringBuffer("");

        //findFirstSetOfCoinsToMakeValue(c, v, str);
        //System.out.println("The list of coins are:" + str.toString());

        //Combination bestCombination = new Combination();
        //Combination currCombination = new Combination(0, new StringBuffer(""));

        //findMinNumOfCoinsToMakeValueUsingExtraDS(c, v, bestCombination, currCombination);
        //System.out.println("The list of coins are:" + bestCombination.toString());

        //
        System.out.println("Minimum number of coins needed to create the value is: " + minimumNumberOfCoinCount(c, v));
    }

    public static boolean findFirstSetOfCoinsToMakeValue(int[] coins, int value, StringBuffer str) {
        if (value == 0)
            return true;
        else if (value < 0)
            return false;

        for (int i = 0; i < coins.length; i++) {
            boolean flag = findFirstSetOfCoinsToMakeValue(coins, value - coins[i], str);
            if (flag) {
                str.append(coins[i] + " ");
                return true;
            }
        }

        return false;
    }

    public static void findMinNumOfCoinsToMakeValueUsingExtraDS(int[] coins, int value, Combination bestCombination
            , Combination currentCombination) {

        if (value == 0) {
            if (currentCombination.cointCount < bestCombination.cointCount) {
                bestCombination.cointCount = currentCombination.cointCount;
                bestCombination.sb = currentCombination.sb;
            }
            return;
        } else if (value < 0)
            return;

        for (int i = 0; i < coins.length; i++) {
            Combination comb = new Combination(currentCombination.cointCount + 1, new StringBuffer(currentCombination.sb + " " + coins[i]));
            findMinNumOfCoinsToMakeValueUsingExtraDS(coins, value - coins[i], bestCombination, comb);
        }
    }

    private static class Combination {
        int cointCount;

        @Override
        public String toString() {
            return "Combination{" +
                    "Minimum coin Count --> " + cointCount +
                    " and list of coins is --> " + sb +
                    '}';
        }

        StringBuffer sb;

        Combination() {
            cointCount = Integer.MAX_VALUE;
            this.sb = new StringBuffer("");
        }

        Combination(int value, StringBuffer sb) {
            cointCount = value;
            this.sb = sb;
        }
    }

    public static int minimumNumberOfCoinCount(int[] c, int v) {
        if (v == 0)
            return 0;

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < c.length; i++) {
            if (c[i] <= v) {
                int sub_res = minimumNumberOfCoinCount(c, v - c[i]);
                if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
                    res = sub_res + 1;
            }
        }

        return res;
    }
}