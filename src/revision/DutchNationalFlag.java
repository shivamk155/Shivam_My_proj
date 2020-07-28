package revision;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 3, 1, 2, 1, 2, 3, 1, 1, 2, 1, 1, 2, 3, 2, 3, 2, 3, 3, 1, 1, 2};

        System.out.println(Arrays.toString(arr));

        int ptr3 = arr.length - 1;
        int ptr1 = 0;

        int i = 0;
        while (i < ptr3) {
            switch (arr[i]) {
                case 1:
                    arr[i] = arr[ptr1];
                    arr[ptr1] = 1;
                    ptr1++;
                    i++;
                    break;

                case 2:
                    i++;
                    break;

                case 3:
                    arr[i] = arr[ptr3];
                    arr[ptr3] = 3;
                    ptr3--;
                    break;
            }


        }

        System.out.println(Arrays.toString(arr));
    }
}
