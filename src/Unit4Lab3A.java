import java.util.Scanner;

/**
 * This class/program displays the largest and smallest integer in a given sequence via a while loop.
 * @author Ethan Yu
 */
public class Unit4Lab3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int count = 0;
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		int number;
		while (count < 10) {
			count++;
			System.out.println("Enter integer " + count + ":");
			number = sc.nextInt();
			smallest = Integer.min(smallest, number);
			largest = Integer.max(largest, number);
		}
		System.out.println("The largest integer of the sequence is " + largest + " and the smallest is " + smallest + ".");
    }
}
