package MazeSolver;

import java.util.LinkedList;

public class mazeSolver {

    // maze
    // 0 = wall
    // 1 = path
    // 2 = destination
    static int[][] maze = { { 2, 0, 1, 1 }, { 1, 1, 0, 1 }, { 0, 1, 1, 1 } };

    // link list used as a stack
    // created Position to store x and y
    static LinkedList<Position> path = new LinkedList<Position>();

    public static void main(String[] args) {
        // default position
        Position p = new Position(0, 3);
        path.push(p);
        // keep track of where we've been
        // .peek gives us first elem of list
        // setting position we've been to = 0, wall
        maze[path.peek().x][path.peek().y] = 0;

    }
}
