import java.util.Arrays;

public class NutsAndBolts {
    public static void main(String[] args) {
        char nuts[] = {'@', '#', '$', '%', '^', '&'};
        char bolts[] = {'$', '%', '&', '^', '@', '#'};

        sortNutsBolts(nuts, bolts, 0, nuts.length - 1);

        System.out.println("nuts are: " + Arrays.toString(nuts));
        System.out.println("nuts are: " + Arrays.toString(bolts));
    }

    public static void sortNutsBolts(char[] nuts, char[] bolts, int low, int high) {
        if (low < high) {
            int partition = partition(nuts, low, high, bolts[high]);
            partition(bolts, low, high, nuts[partition]);

            sortNutsBolts(nuts, bolts, low, partition - 1);
            sortNutsBolts(nuts, bolts, partition + 1, high);
        }
    }

    public static int partition(char[] arr, int low, int high, char pivot) {
        int temp = low;
        char k;

        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                k = arr[temp];
                arr[temp] = arr[i];
                arr[i] = k;
                temp++;
            } else if (arr[i] == pivot) {
                k = arr[high];
                arr[high] = arr[i];
                arr[i] = k;
                i--;
            }
        }
        k = arr[high];
        arr[high] = arr[temp];
        arr[temp] = k;

        return temp;
    }

}