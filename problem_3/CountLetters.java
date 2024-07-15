import java.util.Scanner;

/**
 * The {@code CountLetters} class reads a phrase from the user and counts the frequency
 * of each letter (case-insensitive). It prints the frequencies of letters that appear
 * in the input phrase.
 */
public class CountLetters {

    /**
     * Main method to execute the program.
     *
     * @param args the command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int[] counts = new int[26]; // Array to store letter frequencies (A-Z)
        Scanner scan = new Scanner(System.in); // Scanner object to read user input

        // Get word from user
        System.out.print("Enter a phrase (letters only, please): ");
        String word = scan.nextLine();

        // Convert to all upper case for case insensitivity
        word = word.toUpperCase();
        char lastChar = ' ';
        // Count frequency of each letter in string
        try {
            for (int i = 0; i < word.length(); i++) {
                lastChar = word.charAt(i);
                counts[word.charAt(i) - 'A']++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Print a useful message for non-letter characters
            System.out.println("'" + lastChar + "' is not a letter.");
        }

        // Print frequencies
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }
    }
}
