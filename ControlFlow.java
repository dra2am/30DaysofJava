import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        System.out.println("Enter your name...");
        Scanner in = new Scanner(System.in);
        // String s = in.nextLine();

        // if (s.equals("Caleb")) {
        // System.out.println("Hey Caleb");
        // } else if (s.equals("Sally")) {
        // System.out.println("Hey Sally");
        // } else {
        // System.out.println("You're not welcome here");
        // }

        // int i = 0;
        // while (i < 10) {
        // System.err.println("i is: " + i);
        // i++;
        // }

        // for (int i = 0; i < 10; i++) {
        // System.out.println(i);
        // }

        // even if false, this will run at least once!
        int i = 0;
        do {
            System.out.println("i is: " + i);
            i++;
        } while (i < 10);

        in.close();
    }
}
