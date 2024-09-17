
/*****
 * Nafn: Ma. Kathy Carissa Jamora Todtod
 * e-mail: mkc4@hi.is
 * Lýsing: 
 * The code calculates the final score for an Olympic diving event. It reads execution scores
 * from two swimmers, coordination scores from five judges, and a difficulty level. The program 
 * computes the total execution score by discarding the highest and lowest scores for each swimmer, 
 * calculates the average coordination score by discarding the highest and lowest scores, and 
 * multiplies the sum of these scores by the difficulty level to get the final score. The result is
 * printed with two decimal places.
 */

import java.util.Scanner;
import java.util.Arrays;

public class DyfingarDomarar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read execution scores for swimmer 1 (3 scores)
        System.out.println("Enter execution scores for swimmer 1 (3 scores):");
        double[] execScores1 = new double[3];
        for (int i = 0; i < 3; i++) {
            execScores1[i] = scanner.nextDouble();
        }

        // Read execution scores for swimmer 2 (3 scores)
        System.out.println("Enter execution scores for swimmer 2 (3 scores):");
        double[] execScores2 = new double[3];
        for (int i = 0; i < 3; i++) {
            execScores2[i] = scanner.nextDouble();
        }

        // Read coordination scores (5 scores)
        System.out.println("Enter coordination scores (5 scores):");
        double[] coordScores = new double[5];
        for (int i = 0; i < 5; i++) {
            coordScores[i] = scanner.nextDouble();
        }

        // Read difficulty level
        System.out.println("Enter difficulty level:");
        double difficulty = scanner.nextDouble();

        // Calculate Total Execution for both swimmers by removing highest and lowest
        // score
        Arrays.sort(execScores1);
        Arrays.sort(execScores2);
        double totalExec = (execScores1[1] + execScores2[1]); // middle score after sorting

        // Calculate Coordination by removing highest and lowest and averaging the
        // remaining
        Arrays.sort(coordScores);
        double coordination = (coordScores[1] + coordScores[2] + coordScores[3]) / 3.0;

        // Calculate final score
        double finalScore = (totalExec + coordination) * difficulty;

        // Print the final score with two decimal places
        System.out.printf("%.2f%n", finalScore);

        // Close the scanner
        scanner.close();
    }
}
