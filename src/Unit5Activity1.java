import java.util.Random;
import java.util.Scanner;

/**
 * This class/program
 * - displays the radian form , sine, cosine, and tangent of a given angle in degrees
 * - outputs a sequence of 20 random numbers in the range 1 to 5
 * - counts the number of 6's, 10's, 14's, 18's, and 22's in a randomly generated set of 100 of said numbers
 * - displays the quotient of an inputted two numbers rounded to the integer value, tenth, hundredth, and thousandth.
 * @author Ethan Yu
 */
public class Unit5Activity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        int deg = sc.nextInt();
        float radian = (float) ((float) deg / 180 * Math.PI);
        System.out.println(deg + " degrees is " + radian + " radians, and the sine, cosine, and tangent of " + deg + " degrees is " + Math.cos(radian) + ", " + Math.cos(radian) + ", and " + Math.sin(radian)/Math.cos(radian) + ", respectively.");
        for (int i = 0; i < 20; i++) {
            System.out.println(((int) 5 * Math.random()) + 1);
        }
        Random ret = new Random();
        ret.setSeed(1L);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        for (int i = 0; i < 100; i++) {
            int temp = (4 * (int) (5 * ret.nextDouble()) + 6);
            switch (temp) {
                case 6:
                    a++;
                    break;
                case 10:
                    b++;
                    break;
                case 14:
                    c++;
                    break;
                case 18:
                    d++;
                    break;
                case 22:
                    e++;
                    break;
            }
        }
        System.out.println(a + " 6's, " + b + " 10's, " + c + " 14's, " + d + " 18's, and " + e + " 22's generated.");

        System.out.print("Enter two numbers: ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float div = x / y;
        System.out.println(x + "/" + y + " is approximately " + Math.floor(div + 0.5) + ", " + Math.floor(div * 10 + 0.5)/10 + ", " + Math.floor(div * 100 + 0.5)/100 + ", or " + Math.floor(div * 1000 + 0.5)/1000 + ".");
    }
}
