package revision;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ArrivalDepartureOfTrains {

    private static class TrainTime {
        LocalTime arrivalTime;
        LocalTime departureTime;

        public TrainTime(LocalTime arr, LocalTime dep) {
            this.arrivalTime = arr;
            this.departureTime = dep;
        }

        public LocalTime getArrivalTime() {
            return arrivalTime;
        }

        public void setArrivalTime(LocalTime arrivalTime) {
            this.arrivalTime = arrivalTime;
        }

        public LocalTime getDepartureTime() {
            return departureTime;
        }

        public void setDepartureTime(LocalTime departureTime) {
            this.departureTime = departureTime;
        }
    }

    public static void main(String[] args) {
        String[] arr = {"9:00", "9:40", "9:50", "11:00", "15:00", "18:00"};
        String[] dep = {"9:10", "12:00", "11:20", "11:30", "19:00", "20:00"};

        List<TrainTime> trainList = new ArrayList<>();
        List<TrainTime> platformOccupancyList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++)
            trainList.add(new TrainTime(LocalTime.of(getHours(arr[i]), getMinutes(arr[i])),
                    LocalTime.of(getHours(dep[i]), getMinutes(dep[i]))));

        platformOccupancyList.add(trainList.get(0));

        outerLoop:
        for (int j = 1; j < trainList.size(); j++) {
            boolean isAdded = false;
            for (int i = 0; i < platformOccupancyList.size(); i++) {
                if ((trainList.get(j).arrivalTime.isAfter(platformOccupancyList.get(i).departureTime))) {
                    platformOccupancyList.get(i).setArrivalTime(trainList.get(j).arrivalTime);
                    platformOccupancyList.get(i).setDepartureTime(trainList.get(j).departureTime);
                    isAdded = true;
                    continue outerLoop;
                }
            }
            if (!isAdded)
                platformOccupancyList.add(trainList.get(j));
        }

        System.out.println("Total number of platforms needed for the same is: " + platformOccupancyList.size());
    }

    public static int getHours(String time) {
        return Integer.parseInt(time.split(":")[0]);
    }

    public static int getMinutes(String time) {
        return Integer.parseInt(time.split(":")[1]);
    }
}
