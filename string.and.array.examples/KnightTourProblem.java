import java.util.*;

public class KnightTourProblem {

    public static class Square {
        int row;
        int column;

        Square(int r, int c) {
            row = r;
            column = c;
        }

        @Override
        public String toString() {
            return "Square{" +
                    "row=" + row +
                    ", column=" + column +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Square)) return false;

            Square square = (Square) o;

            if (row != square.row) return false;
            if (column != square.column) return false;

            return true;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, column);
        }
    }

    public static void main(String[] args) {
        int boardSize = 5;
        int[][] arr = new int[5][5];

        Set<Square> visitedNodes = new HashSet<Square>();

        visitedNodes.add(new Square(0, 0));
        arr[0][0] = 0;
        solveKT(arr, 0, 0, boardSize, visitedNodes);

    }

    public static boolean solveKT(int[][] arr, int currentRow, int currentColumn, int boardSize, Set<Square> visitedNodes) {

        if (checkIfAllNodesVisited(arr, boardSize, visitedNodes)) {
            System.out.println(visitedNodes);
            return true;
        } else {
            List<Square> listOfPossibleMoves = getListOfPossibleMoves(arr, currentRow, currentColumn, boardSize, visitedNodes);

            if (listOfPossibleMoves.isEmpty()) {
                return false;
            } else {

                while (!listOfPossibleMoves.isEmpty()) {
                    Square s = listOfPossibleMoves.remove(0);
                    visitedNodes.add(s);
                    boolean flag = solveKT(arr, s.row, s.column, boardSize, visitedNodes);

                    if (flag) {
                        return true;
                    }

                    visitedNodes.remove(s);
                }
            }
        }
        return false;
    }

    public static void addNodeInlist(List<Square> listOfPossibleMoves, Set<Square> visitedNodes, int newRow, int newColumn) {
        Square s = new Square(newRow, newColumn);

        if (!visitedNodes.contains(s)) {
            listOfPossibleMoves.add(s);
        }
    }


    public static List<Square> getListOfPossibleMoves(int[][] arr, int currentRow, int currentColumn, int boardSize, Set<Square> visitedNodes) {
        List<Square> listOfPossibleMoves = new ArrayList<Square>();

        //you can have a list of 8 possible moves
        if (currentRow - 2 >= 0) {
            if (currentColumn - 1 >= 0) {
                addNodeInlist(listOfPossibleMoves, visitedNodes, currentRow - 2, currentColumn - 1);
            }

            if (currentColumn + 1 <= boardSize - 1) {
                addNodeInlist(listOfPossibleMoves, visitedNodes, currentRow - 2, currentColumn + 1);
            }
        }

        if (currentRow + 2 <= boardSize - 1) {
            if (currentColumn - 1 >= 0) {
                addNodeInlist(listOfPossibleMoves, visitedNodes, currentRow + 2, currentColumn - 1);
            }

            if (currentColumn + 1 <= boardSize - 1) {
                addNodeInlist(listOfPossibleMoves, visitedNodes, currentRow + 2, currentColumn + 1);
            }
        }

        if (currentColumn - 2 >= 0) {
            if (currentRow - 1 >= 0) {
                addNodeInlist(listOfPossibleMoves, visitedNodes, currentRow - 1, currentColumn - 2);
            }

            if (currentRow + 1 <= boardSize - 1) {
                addNodeInlist(listOfPossibleMoves, visitedNodes, currentRow + 1, currentColumn - 2);
            }
        }

        if (currentColumn + 2 <= boardSize - 1) {
            if (currentRow - 1 >= 0) {
                addNodeInlist(listOfPossibleMoves, visitedNodes, currentRow - 1, currentColumn + 2);
            }

            if (currentRow + 1 <= boardSize - 1) {
                addNodeInlist(listOfPossibleMoves, visitedNodes, currentRow + 1, currentColumn + 2);
            }
        }

        return listOfPossibleMoves;
    }


    public static boolean checkIfAllNodesVisited(int[][] arr, int boardSize, Set<Square> visitedNodes) {


        if(visitedNodes.size() == boardSize*boardSize)
            return true;
        return false;
    }
}
