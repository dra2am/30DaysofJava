import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class fileReading {
    public static void main(String[] args) throws FileNotFoundException {
        // use scanner to read new File
        Scanner in = new Scanner(new File("notes-java.txt"));

        List<String> students = new ArrayList<String>();

        // while there is a next line, add line to list
        while (in.hasNextLine()) {
            students.add(in.nextLine());
        }

        for (int i = 0; i < students.size(); i++) {
            // goes thru each element (get(i) and prints line)
            System.out.println("name: " + students.get(i));
        }
        in.close();
    }
}

// research collections and interface vs implementation
