import java.util.Scanner;

/**
 * This class/program prints out the type of triangle 3 given side lengths would make.
 * @author Ethan Yu
 */
public class Unit3Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a > 0 && b > 0 && c > 0) && (a + b > c) && (a + c > b) && (b + c > a)){
            System.out.print("The side lengths " + a + ", " + b + ", and " + c + " make a ");
            if (a == b) {
                if (b == c) System.out.print("equilateral");
                else System.out.print("isosceles");
            } else if (b == c || a == c) System.out.print("isosceles");
            else System.out.print("scalene");
            System.out.println(" triangle.");
        } else System.out.println("The values entered do not make a valid triangle");
    }
}
