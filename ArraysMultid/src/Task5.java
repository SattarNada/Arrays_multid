import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter number of crew members: ");
        int persons = scanner.nextInt();

        System.out.print("Enter number of days: ");
        int days = scanner.nextInt();

        int[][] journal = new int[persons][days];


        for (int i = 0; i < persons; i++) {
            System.out.println("Enter minutes for Crew Member " + (i + 1) + ":");
            for (int j = 0; j < days; j++) {
                System.out.print("  Day " + (j + 1) + ": ");
                journal[i][j] = scanner.nextInt();
            }
        }


        int[] dayTotals = new int[days];
        int maxTotal = 0;

        for (int j = 0; j < days; j++) {
            int daySum = 0;
            for (int i = 0; i < persons; i++) {
                daySum += journal[i][j];
            }
            dayTotals[j] = daySum;

            if (daySum > maxTotal) {
                maxTotal = daySum;
            }
        }


        System.out.println("\nLongest working day(s) with total work of " + maxTotal + " minutes:");
        for (int j = 0; j < days; j++) {
            if (dayTotals[j] == maxTotal) {
                System.out.println("Day " + (j + 1));
            }
        }

    }
}
