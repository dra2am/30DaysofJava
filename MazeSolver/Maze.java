package MazeSolver;

import java.util.LinkedList;

public class Maze {
    public int[][] maze;
    // created Position to store x and y
    public Position start;
    // link list used as a stack
    public LinkedList<Position> path = new LinkedList<Position>();

}
