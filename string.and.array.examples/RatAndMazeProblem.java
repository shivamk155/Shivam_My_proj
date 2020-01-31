import java.util.Arrays;

public class RatAndMazeProblem {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}};

        //As per the rules that only 2 type of moves is possible that is forward and down.
        int xMove[] = {0, 1};
        int yMove[] = {1, 0};

        arr[0][0] = -1;
        populateRatPath(arr, 0, 0, xMove, yMove);
    }

    public static boolean populateRatPath(int[][] arr, int x, int y, int[] xMove, int[] yMove) {

        if (x == arr.length - 1 && y == arr[0].length - 1) {
            printArr(arr);
            return true;
        }

        for (int j = 0; j < yMove.length; j++) {
            int k = x + xMove[j];
            int l = y + yMove[j];

            if (isSafe(arr, k, l)) {
                arr[k][l] = -1;
                boolean flag = populateRatPath(arr, k, l, xMove, yMove);
                if (flag)
                    return true;

                arr[k][l] = 1;
            }
        }
        return false;
    }

    public static boolean isSafe(int[][] arr, int x, int y) {
        if (x < arr.length && y < arr[0].length && arr[x][y] == 1)
            return true;

        return false;
    }

    public static void printArr(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }


    }


}
