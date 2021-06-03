/**
 * This class/program prints out characters and their ASCII numbers in ASCII order
 * @author Ethan Yu
 */
public class Unit2Lab1 {
    public static void main(String[] args) {
        for (int i = 43; i < 126; i++) {
            System.out.println("The character " + (char) i + " has the ASCII value " + i + ".");
        }
    }
}
