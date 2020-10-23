package MazeSolver;

import java.util.LinkedList;

public class mazeSolver {

    // maze
    // 0 = wall
    // 1 = path
    // 2 = destination
    static int[][] maze = { { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0 }, { 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0 },
            { 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 2, 0, 1, 1, 1, 0, 1, 0 },
            { 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0 }, { 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1 } };

    // link list used as a stack
    // created Position to store x and y
    static LinkedList<Position> path = new LinkedList<Position>();

    public static void main(String[] args) {
        // calling code is in charge of success or fail
        if (solveMaze(new Position(4, 8))) {
            System.out.println("You won!");
        } else {
            System.out.println("No path ):");
        }

    }

    private static boolean solveMaze(Position p) {
        // pushes in starting position
        path.push(p);

        while (true) {
            // keep track of where we've been
            // .peek gives us first elem of list
            // setting position we've been to = 0, wall
            int x = path.peek().x;
            int y = path.peek().y;
            maze[x][y] = 0;

            // isValid checks if position is out of bounds
            // down
            if (isValid(x + 1, y)) {
                if (maze[x + 1][y] == 2) {
                    System.out.println("Moved down!");
                    return true;
                } else if (maze[x + 1][y] == 1) {
                    System.out.println("Moved down!");
                    path.push(new Position(x + 1, y));
                    continue;
                }
            }

            // left
            if (isValid(x, y - 1)) {
                if (maze[x][y - 1] == 2) {
                    System.out.println("Moved left!");
                    return true;
                } else if (maze[x][y - 1] == 1) {
                    System.out.println("Moved left!");
                    path.push(new Position(x, y - 1));
                    continue;
                }
            }

            // up
            if (isValid(x - 1, y)) {
                if (maze[x - 1][y] == 2) {
                    System.out.println("Moved up!");
                    return true;
                } else if (maze[x - 1][y] == 1) {
                    System.out.println("Moved up!");
                    path.push(new Position(x - 1, y));
                    continue;
                }
            }

            // right
            if (isValid(x, y + 1)) {
                if (maze[x][y + 1] == 2) {
                    System.out.println("Moved right!");
                    return true;
                } else if (maze[x][y + 1] == 1) {
                    System.out.println("Moved right!");
                    path.push(new Position(x, y + 1));
                    continue;
                }
            }

            // if there is no way through, stops program
            path.pop();
            System.out.println("Moved back!");
            if (path.size() <= 0) {
                return false;
            }
        }

    }

    // prevents navigation out of bounds of the maze
    public static boolean isValid(int x, int y) {
        if (x < 0 || x >= maze.length || y < 0 || y >= maze[x].length) {
            return false;
        }
        return true;
    }
}
