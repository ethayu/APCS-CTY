import java.util.Scanner;

/**
 * This class/program prints out a triangle of asterisks at a given size.
 * @author Ethan Yu
 */
public class Unit4Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("How big do you want the triangle to be?");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
    }
}
