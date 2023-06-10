import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public GuessingGame(){

        System.out.println("Hello, whats your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println("Hey " + name + " ,I'm guessing a number between 1 and 100");
        System.out.println("Try to guess the number");
        System.out.print("Your guess?: ");
        int guess = 0;
        int tries = 0;
        while(guess != number) {
            try {
                guess = input.nextInt();
            } catch (InputMismatchException e) {
                String bad_input = input.next(); // need to progress past bad input
                System.out.println("That's not an integer, try again");
                continue;
            }

            if (guess < 1 || guess > 100) {
                System.out.println(guess + " is not a valid number, try again");
                continue;
            }
            tries++;
            if(guess>number){
                System.out.println("Your guess is too high, try again.");

            }
            else if(guess<number){
                System.out.println("Your guess is too low, try again.");
            }


        }
        System.out.println("Well done, you found my number in " + tries + " tries!");
    }
}
