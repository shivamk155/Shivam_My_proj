public class MinimumNumberOfCoins {

    static int minCount = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[] coins = {9, 5, 6, 1};
        int value = 11;

        minNumberCoinsContinous(coins, value, 0, 0);

        System.out.println("Minimum number of coins needed to make value is:" + minCount);
    }


    public static int minNumberCoinsContinous(int[] arr, int value, int start, int coinCount) {
        
        return coinCount;
    }
}
