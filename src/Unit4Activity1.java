import java.util.Scanner;

/**
 * This class/program is a simple multiplication quiz.
 * @author Ethan Yu
 */
public class Unit4Activity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many problems do you want to generate?");
        int n = sc.nextInt();
        int count = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            System.out.println("What is " + number1 + " * " + number2 + "? ");
            int ans = sc.nextInt();
            if (number1 * number2 == ans) {
                count++;
                System.out.println("Congratulations...you are correct!");
            } else System.out.println("Whoops... the correct answer is " + number1 * number2 + ".");
        }
        System.out.println("Your score was " + (double) count/n * 100+ " and you spent " + (System.currentTimeMillis() - start) / 1000 + " seconds playing.");
    }
}
