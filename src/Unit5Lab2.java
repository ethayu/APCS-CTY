import java.util.Scanner;

/**
 * This class/program prints out the calendar for a given month in a given year.
 *
 * @author Ethan Yu
 */
public class Unit5Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the month and the year, respectively: ");
        printMonthCalendar(sc.nextInt(), sc.nextInt());
    }

    static void printMonthCalendar(int m, int y) {
        printMonthHeader(m, y);
        System.out.println("  1   2   3   4   5   6   7");
        System.out.println("  8   9  10  11  12  13  14");
        System.out.println(" 15  16  17  18  19  20  21");
        System.out.print(" 22  23  24  25  26  27  28\n ");
        for (int i = 29; i <= getNumDaysInMonth(m, y); i++) System.out.print(i + "  ");
    }

    static String getMonthName(int m) {
        return switch (m) {
            case 1 -> "January ";
            case 2 -> "February ";
            case 3 -> "March ";
            case 4 -> "April ";
            case 5 -> "May ";
            case 6 -> "June ";
            case 7 -> "July ";
            case 8 -> "August ";
            case 9 -> "September ";
            case 10 -> "October ";
            case 11 -> "November ";
            case 12 -> "December ";
            default -> null;
        };
    }

    static boolean isLeapYear(int y) {
        if (y % 4 == 0)
            if (y % 100 == 0)
                return y % 400 == 0;
            else return true;
        else return false;
    }

    static void printMonthHeader(int m, int y) {
        System.out.println("       " + getMonthName(m) + " " + y);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    static int getNumDaysInMonth(int m, int y) {
        return switch (m) {
            case 1 -> 31;
            case 2 -> isLeapYear(y) ? 29 : 28;
            case 3 -> 31;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 31;
            case 11 -> 30;
            case 12 -> 31;
            default -> 0;
        };
    }

    public static int getStartDay(int m, int d, int y) {
        // Adjust month number & year to fit Zeller's numbering system
        if (m < 3) {
            m = m + 12;
            y = y - 1;
        }

        int k = y % 100;      // Calculate year within century
        int j = y / 100;      // Calculate century term
        int h = 0;            // Day number of first day in month 'm'

        h = (d + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        // Convert Zeller's value to ISO value (1 = Mon, ... , 7 = Sun )
        int dayNum = ((h + 5) % 7) + 1;

        return dayNum;
    }
}
