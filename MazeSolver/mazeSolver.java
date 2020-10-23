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
        // default position
        Position p = new Position(4, 8);
        path.push(p);

        while (true) {
            // keep track of where we've been
            // .peek gives us first elem of list
            // setting position we've been to = 0, wall
            int x = path.peek().x;
            int y = path.peek().y;
            maze[x][y] = 0;

            // check if out of bounds
            if (isValid(x + 1, y)) {
                // down
                if (maze[x + 1][y] == 2) {
                    System.out.println("Moved down! You won!");
                    return;
                } else if (maze[x + 1][y] == 1) {
                    System.out.println("Moved down!");
                    path.push(new Position(x + 1, y));
                    continue;
                }
            }

            if (isValid(x, y - 1)) {
                // left
                if (maze[x][y - 1] == 2) {
                    System.out.println("Moved left! You won!");
                    return;
                } else if (maze[x][y - 1] == 1) {
                    System.out.println("Moved left!");
                    path.push(new Position(x, y - 1));
                    continue;
                }
            }

            if (isValid(x - 1, y)) {
                // up
                if (maze[x - 1][y] == 2) {
                    System.out.println("Moved up! You won!");
                    return;
                } else if (maze[x - 1][y] == 1) {
                    System.out.println("Moved up!");
                    path.push(new Position(x - 1, y));
                    continue;
                }
            }

            if (isValid(x, y + 1)) {
                // right
                if (maze[x][y + 1] == 2) {
                    System.out.println("Moved right! You won!");
                    return;
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
                System.out.println("No path ):");
                return;
            }
        }

    }

    // will not allow out of bounds
    public static boolean isValid(int x, int y) {
        if (x < 0 || x >= maze.length || y < 0 || y >= maze[x].length) {
            return false;
        }
        return true;
    }
}
