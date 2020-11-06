package MazeSolver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class mazeSolver {

    // maze
    // 0 = wall
    // 1 = path
    // 2 = destination

    public static void main(String[] args) throws FileNotFoundException {
        // list of mazes
        ArrayList<Maze> mazes = readMazes();

        // get maze from file
        Scanner in = new Scanner(new File("mazeSolver/mazes.txt"));

        while (in.hasNext()) {
            Maze m = new Maze();

            // get number of rows
            int rows = Integer.parseInt(in.nextLine());

            m.maze = new int[rows][];

            // loops through file
            for (int i = 0; i < rows; i++) {
                // prints first next line as string
                String line = in.nextLine();
                // convert string to int arr
                m.maze[i] = Arrays.stream(line.split(", ")).mapToInt(Integer::parseInt).toArray();
            }

            // get starting position
            m.start = new Position(Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
            // toss extra space
            in.nextLine();
            // and add
            mazes.add(m);
        }

        // close scanner
        in.close();

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

    private static ArrayList<Maze> readMazes() throws FileNotFoundException {
        ArrayList<Maze> mazes = new ArrayList<>();
        Maze m = new Maze();

        // get maze from file
        Scanner in = new Scanner(new File("mazeSolver/mazes.txt"));
        // get number of rows
        int rows = Integer.parseInt(in.nextLine());
        m.maze = new int[rows][];

        // loops through file
        for (int i = 0; i < rows; i++) {
            // prints first next line as string
            String line = in.nextLine();
            // convert string to int arr
            m.maze[i] = Arrays.stream(line.split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        // get starting position and add
        m.start = new Position(Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
        mazes.add(m);

        return mazes;
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
