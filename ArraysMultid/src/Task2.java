import java.util.Scanner;

public class Task2 {
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
        int totalDuration = 0;

        for (int i = 0; i < persons; i++) {
            totalDuration += journal[i][0];
            totalDuration += journal[i][days - 1];
        }


        System.out.println("\nTotal duration of preventive and repair work on Day 1 and Last Day: " + totalDuration + " minutes");


    }
}
