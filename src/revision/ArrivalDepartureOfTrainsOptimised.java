package revision;

import java.util.Arrays;

//This will give the solution in nlogn complexity
public class ArrivalDepartureOfTrainsOptimised {

    public static void main(String[] args) {

        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

        Arrays.sort(arr);
        Arrays.sort(dep);

        int platformNeeded = 1, maxPlatform = 1;
        int arrTrains = 1, depTrains = 0;

        while (arrTrains < arr.length && depTrains < dep.length) {
            if (arr[arrTrains] > dep[depTrains]) {
                depTrains++;
                platformNeeded--;
            } else {
                arrTrains++;
                platformNeeded++;
            }

            if (platformNeeded > maxPlatform)
                maxPlatform = platformNeeded;
        }

        System.out.println("Max platform needed for these trains are:" + maxPlatform);
    }
}
