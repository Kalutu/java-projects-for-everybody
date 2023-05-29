import java.util.Scanner;

public class HangmanGame {
    private static final String[] WORDS = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape"};

    private String word;
    private StringBuilder guessedWord;
    private int attemptsLeft;

    public void play() {
        initializeGame();

        while (attemptsLeft > 0 && guessedWord.indexOf("_") != -1) {
            System.out.println("\nAttempts left: " + attemptsLeft);
            System.out.println("Word: " + guessedWord.toString());

            char guess = getGuessFromPlayer();
            checkGuess(guess);
        }

        if (guessedWord.indexOf("_") == -1) {
            System.out.println("\nCongratulations! You guessed the word: " + word);
        } else {
            System.out.println("\nGame over! You ran out of attempts. The word was: " + word);
        }
    }

    private void initializeGame() {
        word = getRandomWord();
        guessedWord = new StringBuilder(word.length());

        for (int i = 0; i < word.length(); i++) {
            guessedWord.append("_");
        }

        attemptsLeft = 6;
    }

    private String getRandomWord() {
        int index = (int) (Math.random() * WORDS.length);
        return WORDS[index];
    }

    private char getGuessFromPlayer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your guess: ");
        String input = scanner.nextLine().toLowerCase();

        while (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Invalid guess. Please enter a single letter.");
            System.out.print("Enter your guess: ");
            input = scanner.nextLine().toLowerCase();
        }

        return input.charAt(0);
    }

    private void checkGuess(char guess) {
        boolean guessedCorrectly = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                guessedWord.setCharAt(i, guess);
                guessedCorrectly = true;
            }
        }

        if (guessedCorrectly) {
            System.out.println("Correct guess!");
        } else {
            System.out.println("Incorrect guess!");
            attemptsLeft--;
        }
    }

    public static void main(String[] args) {
        HangmanGame game = new HangmanGame();
        game.play();
    }
}

