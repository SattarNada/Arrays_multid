import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of crew members (excluding commander): ");
        int crewCount = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[crewCount + 1];


        System.out.print("Enter the name of the commander: ");
        names[0] = scanner.nextLine();

        for (int i = 1; i <= crewCount; i++) {
            System.out.print("Enter the name of crew member " + i + ": ");
            names[i] = scanner.nextLine();
        }


        String commanderName = names[0];
        String[] crewMembers = Arrays.copyOfRange(names, 1, names.length);
        Arrays.sort(crewMembers);

        int index = Arrays.binarySearch(crewMembers, commanderName);


        if (index >= 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
