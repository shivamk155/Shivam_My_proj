import java.util.*;

public class RottenOranges {
    public static void main(String[] args) {
        //0: Empty cell
        //1: Cells have fresh oranges
        //2: Cells have rotten oranges
        int[][] arr = {
                {2, 1, 0, 0, 1},
                {1, 0, 1, 1, 1},
                {0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1}};

        int freshOrange = getFreshOrangeCount(arr);
        int rottedOranges = 0;
        int days = 0;
        Queue<Location> freshOrangeSet = new LinkedList<Location>();

        do {
            if (!freshOrangeSet.isEmpty()) {
                rottedOranges += rotAllNearbyOranges(freshOrangeSet, arr);
                days++;
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (arr[i][j] == 2) {
                        findNearbyFreshOrange(i, j, freshOrangeSet, arr);
                    }
                }
            }

        } while (!freshOrangeSet.isEmpty());

        if (rottedOranges == freshOrange) {
            System.out.println("All fresh oranges will rot in: " + days + " days");
        } else {
            System.out.println("There will still be fresh oranges in the bucket.");
        }
    }

    public static int rotAllNearbyOranges(Queue<Location> orangesToBeRot, int[][] arr) {
        int orange = 0;
        while (null != orangesToBeRot.peek()) {
            Location l = orangesToBeRot.poll();
            arr[l.getRow()][l.getColumn()] = 2;
            orange++;
        }

        return orange;
    }

    public static int getFreshOrangeCount(int[][] arr) {
        int i = 0;

        for (int k = 0; k < arr.length; k++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[k][j] == 1) {
                    i++;
                }
            }
        }

        return i;
    }

    public static void findNearbyFreshOrange(int row, int column, Queue<Location> set, int[][] arr) {

        int[] nearRow = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] nearCol = {0, 1, 1, 1, 0, -1, -1, -1};

        for (int i = 0; i < nearRow.length; i++) {
            int nextRow = row + nearRow[i];
            int nextCol = column + nearCol[i];
            if (safeAndFreshOrange(nextRow, nextCol, arr) && !set.contains(new Location(nextRow, nextCol))) {
                set.add(new Location(nextRow, nextCol));
            }
        }
    }

    public static boolean safeAndFreshOrange(int nextRow, int nextColumn, int[][] arr) {
        if (nextRow < 0 || nextRow >= arr.length)
            return false;

        if (nextColumn < 0 || nextColumn >= arr[0].length)
            return false;

        if (arr[nextRow][nextColumn] != 1)
            return false;

        return true;
    }

    private static class Location {
        int row;
        int column;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Location location = (Location) o;
            return row == location.row &&
                    column == location.column;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, column);
        }

        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }

        public int getColumn() {
            return column;
        }

        public void setColumn(int column) {
            this.column = column;
        }

        public Location(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }
}
