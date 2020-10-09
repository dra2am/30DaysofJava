import java.util.Scanner;

public class fortuneTeller {
    public static void main(String[] args) {
        boolean runFortune = true;
        System.out.println("Enter a number from 1-10, enter 0 to quit");
        Scanner input = new Scanner(System.in);
        while (runFortune) {

            // get user input, int 1-10
            int userInput;
            userInput = input.nextInt();
            // if int > 5 "fortune a" < 5 "fortune b"
            if (userInput > 5 && userInput <= 10) {
                System.out.println("You're going to have a great hair day");
            } else if (userInput <= 5 && userInput > 0) {
                System.out.println("You're gonna kiss your birds");
            } else if (userInput == 0) {
                runFortune = false;
            } else {
                System.out.println("1 TO 10 OR 0 TO QUIT");
            }
        }
        input.close();
    }
}
