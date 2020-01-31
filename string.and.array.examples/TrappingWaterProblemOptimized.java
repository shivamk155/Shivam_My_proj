public class TrappingWaterProblemOptimized {

    public static void main(String[] args) {
        //int[] arr = {1, 0, 0, 4, 0, 3, 0, 2};
        int[] arr = {1, 0, 0, 4, 0, 2};

        System.out.println("ToTal water trapped: " + trappingWaterOptimized(arr, arr.length - 1));
    }

    public static int trappingWaterOptimized(int[] arr, int end) {
        int waterTrapped = 0;
        int temp = 0;

        int prev = arr[0];
        int prev_index = 0;

        for (int i = 1; i <= end; i++) {
            if (arr[i] > prev) {
                prev = arr[i];
                prev_index = i;
                temp = 0;

            } else {
                waterTrapped = waterTrapped + (prev - arr[i]);

                temp = temp + (prev - arr[i]);
            }
        }

        if (prev_index < end) {
            waterTrapped = waterTrapped - temp;
            prev = arr[end];

            for (int i = end - 1; i > prev_index; i--) {
                if (arr[i] > prev) {
                    prev = arr[i];

                } else {
                    waterTrapped = waterTrapped + (prev - arr[i]);
                }
            }
        }
        return waterTrapped;
    }

}
