package revision;

public class ArrivalDepartureOfTrainsOptimised2 {
    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

        int platformNeeded = 0;
        int[] dayClock = new int[2361];

        for (int i = 0; i < arr.length; i++) {
            dayClock[arr[i]]++;
            dayClock[dep[i] + 1]--;
        }

        for (int i = 1; i < dayClock.length; i++) {
            dayClock[i] = dayClock[i] + dayClock[i - 1];

            if (dayClock[i] > platformNeeded)
                platformNeeded = dayClock[i];
        }

        System.out.println("Total platform needed is --> " + platformNeeded);
    }
}
