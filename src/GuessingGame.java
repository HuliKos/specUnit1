import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        new GuessingGame();
    }
    public GuessingGame() {
        System.out.println("Howdy, what's your name?");
        System.out.println("(type in your name)");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        Random rand = new Random();
        int number = rand.nextInt(100);

        int attempts = 0;

        while (true) {
            Scanner numberInput = new Scanner(System.in);
            int numberIn;

            System.out.print("Your guess? ");

            try {
                numberIn = numberInput.nextInt();
            } catch (InputMismatchException e) {
                String bad_input = numberInput.next();
                System.out.println("That's not an integer, try again");
                continue;
            }

            if (numberIn < 1 || numberIn > 100) {
                System.out.println("Please enter a valid number within range of 1-100.");
                continue;
            }

            attempts += 1;

            if (numberIn > number) {
                System.out.println("Your guess is too high, try again.");
            } else if (numberIn < number) {
                System.out.println("Your guess is too low, try again.");
            } else {
                System.out.println("Well done, " + name + "! You found my number in " + attempts + " tries!");
                break;
            }
        }
    }
}