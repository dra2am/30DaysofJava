package MazeSolver;

import java.util.ArrayList;
import java.util.LinkedList;

public class mazeSolver {

    // maze
    // 0 = wall
    // 1 = path
    // 2 = destination

    public static void main(String[] args) {
        // list of mazes
        ArrayList<Maze> mazes = new ArrayList<Maze>();

        // creating maze m as an instance of maze class
        Maze m = new Maze();

        int[][] maze = { { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0 }, { 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0 },
                { 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 2, 0, 1, 1, 1, 0, 1, 0 },
                { 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0 }, { 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1 } };

        // setting properties of maze m
        m.maze = maze;
        m.start = new Position(4, 8);
        m.path = new LinkedList<Position>();

        // creating maze n as an instance of maze class
        Maze n = new Maze();

        int[][] maze_n = { { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0 }, { 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0 },
                { 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 2, 0, 1, 1, 1, 0, 1, 0 },
                { 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0 }, { 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1 } };

        // setting properties of maze n
        n.maze = maze_n;
        n.start = new Position(4, 8);
        n.path = new LinkedList<Position>();

        // adding mazes to arraylist of mazes
        mazes.add(m);
        mazes.add(n);

        // loops through arraylist maze to solve all mazes
        int i = 0;
        while (i < mazes.size()) {
            // loop through arraylist
            // calling code is in charge of success or fail
            if (solveMaze(mazes.get(i))) {
                System.out.println("You won!");
            } else {
                System.out.println("No path ):");
            }
            i++;
        }

    }

    private static boolean solveMaze(Maze m) {
        // pushes in starting position
        Position p = m.start;
        m.path.push(p);

        while (true) {
            // keep track of where we've been
            // .peek gives us first elem of list
            // setting position we've been to = 0, wall
            int x = m.path.peek().x;
            int y = m.path.peek().y;
            m.maze[x][y] = 0;

            // isValid checks if position is out of bounds
            // down
            if (isValid(x + 1, y, m)) {
                if (m.maze[x + 1][y] == 2) {
                    System.out.println("Moved down!");
                    return true;
                } else if (m.maze[x + 1][y] == 1) {
                    System.out.println("Moved down!");
                    m.path.push(new Position(x + 1, y));
                    continue;
                }
            }

            // left
            if (isValid(x, y - 1, m)) {
                if (m.maze[x][y - 1] == 2) {
                    System.out.println("Moved left!");
                    return true;
                } else if (m.maze[x][y - 1] == 1) {
                    System.out.println("Moved left!");
                    m.path.push(new Position(x, y - 1));
                    continue;
                }
            }

            // up
            if (isValid(x - 1, y, m)) {
                if (m.maze[x - 1][y] == 2) {
                    System.out.println("Moved up!");
                    return true;
                } else if (m.maze[x - 1][y] == 1) {
                    System.out.println("Moved up!");
                    m.path.push(new Position(x - 1, y));
                    continue;
                }
            }

            // right
            if (isValid(x, y + 1, m)) {
                if (m.maze[x][y + 1] == 2) {
                    System.out.println("Moved right!");
                    return true;
                } else if (m.maze[x][y + 1] == 1) {
                    System.out.println("Moved right!");
                    m.path.push(new Position(x, y + 1));
                    continue;
                }
            }

            // if there is no way through, stops program
            m.path.pop();
            System.out.println("Moved back!");
            if (m.path.size() <= 0) {
                return false;
            }
        }

    }

    // prevents navigation out of bounds of the maze
    public static boolean isValid(int x, int y, Maze m) {
        if (x < 0 || x >= m.maze.length || y < 0 || y >= m.maze[x].length) {
            return false;
        }
        return true;
    }
}
