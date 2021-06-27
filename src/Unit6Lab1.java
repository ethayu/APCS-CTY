import java.util.Scanner;

/**
 * This class/program prints out the number of occurrences of each integer in an inputted list.
 *
 * @author Ethan Yu
 */
public class Unit6Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many integers will be entered?: ");
        int n = sc.nextInt();
        int[] count = new int[51];
        System.out.println("Please enter your integers.");
        for (int i = 0; i < n; i++) count[sc.nextInt()]++;
        for (int i = 0; i < 51; i++) {
            if (count[i] != 0) {
                System.out.print(i + " occurs " + count[i]);
                if (count[i] == 1) System.out.println(" time");
                else System.out.println(" times");
            }
        }
    }
}
