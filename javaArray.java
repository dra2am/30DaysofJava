import java.util.Scanner;

public class javaArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give us a size");
        // int size waits for an input
        int size = in.nextInt();

        // this array's size is equal to int size
        int[] grades = new int[size];
        System.out.println("Enter " + size + " numbers. Press enter after each");

        // for each available space in arr, wait for an int input
        for (int i = 0; i < size; i++) {
            grades[i] = in.nextInt();
        }
        // we are done taking information
        in.close();

        // now print each item in the array
        for (int i = 0; i < size; i++) {
            System.out.println(grades[i]);
        }

    }
}
