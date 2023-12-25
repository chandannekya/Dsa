import java.util.Random;
import java.util.Scanner;
 class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Guess the Number game!");
        System.out.println("I've chosen a number between 1 and 100. Can you guess it?");

        int attempts = 0;

        while (true) {
            System.out.print("Enter your guess (between 1 and 100): ");

            if (scanner.hasNextInt()) {
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
                    break;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.close();
    }
}
