public class AppleAndTheFarm {
    public static void main(String[] args) {
        //int[] apples = {5, 4, 3, 2, 1};
        //int[] milk = {5, 4, 3, 2, 1};

        //int[] apples = {4, 5, 1, 10, 20};
        //int[] milk = {3, 0, 0, 1, 2};

        int[] apples = {10, 8, 15, 20, 400};
        int[] milk = {3, 10, 8, 2, 3};

        int initialEnergy = 1;
        int farmCount = apples.length;

        int k = getMaxApplesFromTheFarm(apples, milk, initialEnergy - 1, farmCount, 1, 0);
        System.out.println("Maximum apples ne can accumalate is:" + k);
    }

    public static int getMaxApplesFromTheFarm(int[] apples, int[] milk, int energy, int farmCount, int currentFarm, int currentApple) {
        if (energy < 0 || farmCount < currentFarm)
            return currentApple;

        return Math.max(
                getMaxApplesFromTheFarm(apples, milk, energy - 1, farmCount, currentFarm + 1, currentApple + apples[currentFarm - 1]),
                getMaxApplesFromTheFarm(apples, milk, energy - 1 + milk[currentFarm - 1], farmCount, currentFarm + 1, currentApple));
    }
}
