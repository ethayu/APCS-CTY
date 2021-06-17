import java.util.Random;
import java.util.Scanner;

/**
 * This class/program solves 3 problems - Future Value of a Single Sum, Present Value of a Single Sum, and Future Value of an Annuity
 * @author Ethan Yu
 */
public class Unit5Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to solve: \n (A) Future Value of a Single Sum\n (B) Present Value of a Single Sum\n (C) Future Value of an Annuity");
        switch (sc.next()) {
            case "A":
                System.out.print("Please input the initial deposit in dollars: ");
                double d = sc.nextDouble();
                System.out.print("the annual interest rate in percent: ");
                float i = 1 + (float) sc.nextInt() / 1200;
                System.out.print("and the number of years to calculate to: ");
                int y = sc.nextInt();
                System.out.println("\nAfter " + y + " years, an initial deposit of " + d + " dollars will become " + Math.floor(d * Math.pow(i, y * 12) * 100 + 0.5)/100 + " dollars.");
                break;
            case "B":
                System.out.print("Please input target balance in dollars: ");
                d = sc.nextDouble();
                System.out.print("the annual interest rate in percent: ");
                i = 1 + (float) sc.nextInt() / 1200;
                System.out.print("and the number of years to calculate to: ");
                y = sc.nextInt();
                System.out.println("\nGiven " + y + " years, a target balance of " + d + " dollars will need an initial deposit of " + Math.floor(d / Math.pow(i, y * 12) * 100 + 0.5)/100 + " dollars.");
                break;
            case "C":
                System.out.println("Please input the monthly deposit in dollars: ");
                d = sc.nextDouble();
                System.out.print("the annual interest rate in percent: ");
                i = (float) sc.nextInt() / 1200;
                System.out.println("and the number of years to calculate to: ");
                y = sc.nextInt();
                System.out.println("\nAfter " + y + " years, a monthly deposit of " + d + " dollars will become " + Math.floor(d * (Math.pow(i + 1, y * 12) - 1) / i * 100 + 0.5)/100 + " dollars.");
                break;
            default:
                System.out.println("Invalid input. Please restart the program and try again.");
                break;
        }
    }
}
