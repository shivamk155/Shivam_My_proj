public class NumberOfIslands {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1}};

        int islands = 0;
        boolean[][] visitedIslands = new boolean[arr.length][arr[0].length];
        int[] rowMoves = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] colMoves = {0, 1, 1, 1, 0, -1, -1, -1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (!visitedIslands[i][j] && arr[i][j] == 1) {
                    islands++;
                    DFS(arr, i, j, visitedIslands, rowMoves, colMoves);
                }
            }
        }

        System.out.println("Number of islands: " + islands);
    }

    public static void DFS(int[][] arr, int row, int column, boolean[][] visitedIslands, int[] rowMoves, int[] colMoves) {

        visitedIslands[row][column] = true;
        for (int i = 0; i < rowMoves.length; i++) {
            int nextRow = row + rowMoves[i];
            int nextCol = column + colMoves[i];
            if (isSafe(nextRow, nextCol, arr) && !visitedIslands[nextRow][nextCol] && arr[nextRow][nextCol] == 1) {
                DFS(arr, nextRow, nextCol, visitedIslands, rowMoves, colMoves);
            }
        }
    }

    public static boolean isSafe(int row, int column, int[][] arr) {
        if (row < 0 || row >= arr.length)
            return false;

        if (column < 0 || column >= arr[0].length)
            return false;

        return true;
    }
}
