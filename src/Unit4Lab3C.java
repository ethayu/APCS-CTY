import java.util.Scanner;

/**
 * This class/program displays the largest and smallest integer in a given sequence via a do while loop.
 * @author Ethan Yu
 */
public class Unit4Lab3C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int count = 0;
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		int number;
		do {
			count++;
			System.out.println("Enter integer " + count + ":");
			number = sc.nextInt();
			smallest = Integer.min(smallest, number);
			largest = Integer.max(largest, number);
		} while (count < 10);
		System.out.println("The largest integer of the sequence is " + largest + " and the smallest is " + smallest + ".");
    }
}
