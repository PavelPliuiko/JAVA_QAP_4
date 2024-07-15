import java.util.Scanner;

/**
 * The {@code ParseInts} class reads a line of text from the user,
 * parses integers from the line, computes their sum, and prints the result.
 */
public class ParseInts {

    /**
     * Main method to execute the program.
     *
     * @param args the command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int val, sum = 0; // Initialize variables for holding values and sum
        Scanner scanner = new Scanner(System.in); // Scanner to read user input
        String line; // String to store the input line

        // Prompt user to enter a line of text
        System.out.print("Enter a line of text: ");
        Scanner scanline = new Scanner(scanner.nextLine()); // Scanner to parse the input line

        try {
            // Loop through each token in the input line
            while (scanline.hasNext()) {
                val = Integer.parseInt(scanline.next()); // Parse the token as an integer
                sum += val; // Add the parsed integer to the sum
            }
        } catch (NumberFormatException e) {
            // Catch block to handle NumberFormatException (if non-integer tokens are encountered)
            // No action needed in catch block, just continue with the sum calculation
        }

        // Print the sum of the numbers
        System.out.println("The sum of the numbers is: " + sum);
    }
}
