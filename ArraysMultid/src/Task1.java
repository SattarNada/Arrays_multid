
import java.util.Scanner;

public class Task1 {public static void main(String[] args) {
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

    System.out.println("\n=== Preventive and Repair Work Journal ===");
    for (int i = 0; i < persons; i++) {
        System.out.print("Crew Member " + (i + 1) + ": ");
        for (int j = 0; j < days; j++) {
            System.out.print(journal[i][j] + " ");
        }
        System.out.println();
    }

}
}
