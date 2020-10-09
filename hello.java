import java.util.Scanner;

// everything in java is in classes

//class must share file name
public class hello {
    // this is a method in the class
    public static void main(String[] args) {
        // Java does not like single quotes
        System.out.println("Ew what is this");
        // taking user input
        // create a Scanner obj
        // also these are variables
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        // prints the input back out
        System.out.println(s);
        in.close();

    }
}
