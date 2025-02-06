package Students;
import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        	
            System.out.print("Enter the ID: ");
            String id = scanner.nextLine();

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your department: ");
            String dep = scanner.nextLine();

            System.out.print("Enter your location: ");
            String loc = scanner.nextLine();

            System.out.print("Enter your phone no.: ");
            long ph = scanner.nextLong();
            scanner.nextLine(); 

            System.out.println("\nStudent Details:");
            System.out.println("----------------");
            System.out.println("My ID is: " + id);
            System.out.println("My name is: " + name);
            System.out.println("My department is: " + dep);
            System.out.println("My location is: " + loc);
            System.out.println("My phone no.: " + ph);

            System.out.print("Do you want to add another student? (Y/N): ");
            char choice = scanner.next().charAt(0);
            scanner.nextLine(); 

            if (choice != 'y' && choice != 'Y') {
                break; 
            }
        }

        scanner.close();
    }
}
