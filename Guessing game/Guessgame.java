import java.util.Random;
import java.util.Scanner;

public class Guessgame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1; // Generate a random number between 1 and 100
        int guess;
        int numGuesses = 0;
        boolean correct = false;
        
        System.out.println("Guess a number between 1 and 100:");
        
        while (!correct) {
            guess = input.nextInt();
            numGuesses++;
            
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + numGuesses + " guesses.");
                correct = true;
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again:");
            } else {
                System.out.println("Too high, try again:");
            }
        }
        
        input.close();
    }
}

