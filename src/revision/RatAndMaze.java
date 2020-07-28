package revision;

public class RatAndMaze {
    public static void main(String[] args) {
        int[][] maze = {
                {1, 1, 0, 0, 0, 1},
                {0, 1, 1, 0, 0, 0},
                {0, 0, 1, 1, 1, 1},
                {0, 0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0, 0},
                {0, 1, 1, 1, 1, 1}};

        int[] xMoves = {0, 0, -1, 1};
        int[] yMoves = {-1, 1, 0, 0};

        int xStart = 0;
        int yStart = 0;

        boolean ratExited = ratMazeExited(maze, xStart, yStart, xMoves, yMoves);
        if (ratExited)
            System.out.println("Rat has exited the maze successfully.");
        else
            System.out.println("Rat has NOT exited the maze.");
    }

    private static boolean ratMazeExited(int[][] maze, int xStart, int yStart, int[] xMoves, int[] yMoves) {
        if (xStart == maze.length - 1 && yStart == maze[1].length - 1)
            return true;

        for (int i = 0; i < xMoves.length; i++) {
            int xNextMove = xStart + xMoves[i];
            int yNextMove = yStart + yMoves[i];
            if (isMoveValid(maze, xNextMove, yNextMove)) {
                maze[xNextMove][yNextMove] = -1;
                boolean ratExited = ratMazeExited(maze, xNextMove, yNextMove, xMoves, yMoves);
                if (ratExited)
                    return ratExited;
                else {
                    maze[xNextMove][yNextMove] = 1;
                    System.out.println("taking a step back from:" + xNextMove + " " + yNextMove);
                }
            }
        }

        return false;
    }


    private static boolean isMoveValid(int[][] maze, int xNextMove, int yNextMove) {
        if (xNextMove < 0 || yNextMove < 0)
            return false;

        if (xNextMove >= maze.length || yNextMove >= maze[1].length)
            return false;

        if (maze[xNextMove][yNextMove] == 0 || maze[xNextMove][yNextMove] == -1)
            return false;

        return true;
    }
}
