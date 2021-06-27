import java.util.Scanner;

/**
 * This class/program prints out the calendar for a given month in a given year.
 *
 * @author Ethan Yu
 */
public class Unit5Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter 3 doubles: ");
            double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
            System.out.println("\nThe minimum of " + a + ", " + b + ", and " + c + " is " + minimum(a, b, c) +
                    " and the maximum is " + maximum(a, b, c) + ".");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter 4 test scores: ");
            double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), d = sc.nextDouble(),
            avg = (double) Math.round((a + b + c + d) / 4 * 10) / 10;
            int avg_rounded = (int) (avg + 0.5);
            char letter;
            if (avg_rounded <= 100 && avg_rounded >= 90) letter = 'A';
            else if (avg_rounded >= 80) letter = 'B';
            else if (avg_rounded >= 70) letter = 'C';
            else if (avg_rounded >= 65) letter = 'D';
            else letter = 'F';
            System.out.println("\nThe minimum test score is " + (int) Math.min(a, Math.min(b, Math.min(c, d))) + ", the maximum test score is " + (int) Math.max(a, Math.max(b, Math.max(c, d)))
                    + ", the average test score is " + avg + ", and the letter grade is " + letter + ".");
        }
    }

    static double minimum(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }

    static double maximum(double a, double b, double c) {
        return Math.max(a, Math.max(b, c));
    }

}
