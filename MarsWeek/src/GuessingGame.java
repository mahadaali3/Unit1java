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
        int guess = input.nextInt();
        int tries = 1;
        while(guess != number) {
            if(guess>number){
                System.out.println("Your guess is too high, try again.");

            }
            else if(guess<number){
                System.out.println("Your guess is too low, try again.");
            }
            tries++;
            guess = input.nextInt();
        }
        System.out.println("Well done, you found my number in " + tries + " tries!");
    }
}
