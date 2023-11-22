import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Random random = new Random();
        String startAgain;

        do {
            int randomNo = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;

            System.out.println("Welcome to the Number Guessing Game!");

            while (attempts < maxAttempts) {
                System.out.print("Guess the Random number (between 1 and 100): ");
                int userGuess = inputScanner.nextInt();
                attempts++;

                if (userGuess == randomNo) {
                    System.out.println("Congratulations! You have guessed the number " + randomNo + " in " + attempts
                            + " attempts.");
                    break;
                } else if (userGuess < randomNo) {
                    System.out.println("Try a higher number.");
                } else {
                    System.out.println("Try a lower number.");
                }
            }

            if (attempts >= maxAttempts) {
                System.out.println("Sorry, you've used all your attempts. The number was " + randomNo + ".");
            }

            System.out.println("Do you want to play again? Enter yes/no \n");
            startAgain = inputScanner.next().toLowerCase(); // Convert to lowercase for case-insensitive comparison
        } while (startAgain.equals("yes"));

        System.out.println("Thanks for playing the Number Guessing Game!");
        inputScanner.close();
    }
}
