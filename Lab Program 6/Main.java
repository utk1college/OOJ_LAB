import CIE.Internals;
import SEE.External;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        Internals[] internals = new Internals[n];
        External[] externals = new External[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("USN: ");
            String usn = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Semester: ");
            int sem = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.println("Enter Internal Marks (5 courses): ");
            int[] internalMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                internalMarks[j] = sc.nextInt();
            }

            internals[i] = new Internals(usn, name, sem, internalMarks);

            System.out.println("Enter External Marks (5 courses): ");
            int[] externalMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                externalMarks[j] = sc.nextInt();
            }
            sc.nextLine(); // Consume newline

            externals[i] = new External(usn, name, sem, externalMarks);
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            internals[i].displayPersonalDetails();
            internals[i].displayInternalMarks();
            externals[i].displayExternalMarks();
            System.out.println();
        }

        System.out.println("UTKRISHT UMANG\n1BM23ET056");
        
        sc.close();
    }
}
