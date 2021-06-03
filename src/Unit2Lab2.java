import java.util.Scanner;

/**
 * This class/program prints out the number of dollars, quarters, dimes, nickles, and pennies in an inputted amount.
 * @author Ethan Yu
 */
public class Unit2Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        System.out.print("$" + amount + " consists of " + (int) amount + " dollars, ");
        amount -= (int) amount;
        System.out.print((int) (amount / 0.25) + " quarters, ");
        amount %= 0.25;
        System.out.print((int) (amount / 0.1) + " dimes, ");
        amount %= 0.1;
        System.out.print((int) (amount / 0.05) + " nickles, and ");
        amount %= 0.05;
        System.out.print((int) (amount / 0.01) + " pennies.");
        int result;
        int a = 8;
        int b = 24;
        int c = 74;
        int d = 102;
        result = d % a * c + a % b + a;
        System.out.println(result);
    }
}
