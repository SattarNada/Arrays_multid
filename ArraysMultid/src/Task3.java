import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of astronauts: ");
        int persons = scanner.nextInt();

        System.out.print("Enter number of days: ");
        int days = scanner.nextInt();

        double[][] journal = new double[persons][days];


        for (int i = 0; i < persons; i++) {
            System.out.println("Enter minutes for Astronaut " + (i + 1) + ":");
            for (int j = 0; j < days; j++) {
                System.out.print("  Day " + (j + 1) + ": ");
                journal[i][j] = scanner.nextDouble();
            }
        }


        int workCount = 0;
        double totalMinutes = 0;

        for (int i = 0; i < persons; i++) {
            for (int j = 0; j < days; j++) {
                if (journal[i][j] > 0) {
                    workCount++;
                    totalMinutes += journal[i][j];
                }
            }
        }


        System.out.println("\nNumber of times work was performed: " + workCount);
        System.out.println("Total duration of all work performed: " + totalMinutes + " minutes");


    }
}
