
/*****
 * Nafn: Ma. Kathy Carissa Jamora Todtod
 * e-mail: mkc4@hi.is
 * Lýsing: The code reads two lines, each containing three words, and compares the words 
 * in the same positions. It outputs a decimal number representing a three-bit binary 
 * code where each bit indicates whether the corresponding words are identical
 */

import java.util.Scanner;

public class EinsOrd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first line (three words)
        System.out.println("Sláðu inn fyrstu línu (þrjú orð):");
        String word1_1 = scanner.next();
        String word1_2 = scanner.next();
        String word1_3 = scanner.next();

        // Read the second line (three words)
        System.out.println("Sláðu inn aðra línu (þrjú orð):");
        String word2_1 = scanner.next();
        String word2_2 = scanner.next();
        String word2_3 = scanner.next();

        // Initialize the binary result to 0 (000 in binary)
        int binaryResult = 0;

        // Compare the first words, if equal, set the first bit (value 4)
        if (word1_1.equals(word2_1)) {
            binaryResult += 4;
        }

        // Compare the second words, if equal, set the second bit (value 2)
        if (word1_2.equals(word2_2)) {
            binaryResult += 2;
        }

        // Compare the third words, if equal, set the third bit (value 1)
        if (word1_3.equals(word2_3)) {
            binaryResult += 1;
        }

        // Output the binary result in decimal form
        System.out.println(binaryResult);

        // Close the scanner
        scanner.close();
    }
}
