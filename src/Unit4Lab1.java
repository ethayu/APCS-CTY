import java.util.Scanner;

/**
 * This class/program is a guessing game.
 * @author Ethan Yu
 */
public class Unit4Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		boolean again = true;
		while (again) {
        System.out.println("How many guesses do you want to make?");
        int n = sc.nextInt();
        System.out.println("Pick a maximum value for the mystery number.");
        int top = sc.nextInt();
        int randomNumber = (int) ( top * Math.random() ) + 1;
			for (int i = 0; i < n; i++) {
				System.out.println("Guess " + (i + 1) + ":");
				int ret = sc.nextInt();
				if (ret > randomNumber) System.out.println("too high");
				else if (ret < randomNumber) System.out.println("too low");
				else {
					System.out.println("correct");
					System.out.println("It took you " + (i + 1) + " tries to guess the number.");
					break;
				}
			}
			System.out.println("The game is over! Play again? (Y/n)");
			String ret = sc.next();
			if (ret.equals("n")) again = false;
		}
    }
}
