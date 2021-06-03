import java.util.Scanner;

/**
 * This class/program displays the largest and smallest integer in a given sequence via a for loop.
 * @author Ethan Yu
 */
public class Unit4Lab3B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int count;
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		int number;
		for (count = 0; count < 10; count++) {
			System.out.println("Enter integer " + (count + 1) + ":");
			number = sc.nextInt();
			smallest = Integer.min(smallest, number);
			largest = Integer.max(largest, number);
		}
		System.out.println("The largest integer of the sequence is " + largest + " and the smallest is " + smallest + ".");
    }
}
