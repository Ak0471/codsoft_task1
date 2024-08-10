import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 5;
        int score = 0;
        boolean playAgain = true;
        System.out.println("Welcome to the Number Guessing Game!");
        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;
            System.out.println("I have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");
            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                    score++;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high Try again.");
                } else {
                    System.out.println("Too low Try again.");
                }
                if (attempts == maxAttempts && !guessedCorrectly) {
                    System.out.println("Sorry, you've used all your attempt. The correct number was: " + numberToGuess);
                }
            }
            System.out.println("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing Your total score is: " + score);
        scanner.close();
    }
}
