import java.util.Scanner;
import java.util.ArrayList;

public class PropertyManagementSystem1{
	public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        ArrayList<Property> properties = new ArrayList<>();

        int choice;

        // 1️. DO-WHILE LOOP (menu)
        do {
            System.out.println("\nPROPERTY MANAGEMENT SYSTEM");
            System.out.println("1. Add Properties");
            System.out.println("2. View Properties");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
			
			choice = scan.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nEnter property details");
					
					
                    // 2. SENTINEL CONTROL LOOP
                    while (true) {
                        System.out.print("Enter Property ID (-1 to stop): ");
                        int id = scan.nextInt();

                        if (id == -1) {
                            break; // stop adding properties
                        }

                        scan.nextLine();
                        System.out.print("Enter Address: ");
                        String address = scan.nextLine();

                        System.out.print("Enter Rent: ");
                        double rent = scan.nextDouble();

                        // 3️. CONTINUE STATEMENT
                        if (rent <= 0) {
                            System.out.println("Invalid rent! Try again.");
                            continue; // skip saving this property
                        }

                        properties.add(new Property(id, address, rent));
                        System.out.println("Property added successfully!");
                    }
                    break;

                case 2:
                    System.out.println("\nLIST OF PROPERTIES");
                    for (Property p : properties) { // enhanced for loop
                        p.display();
                    }
                    break;

                case 3:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 3); // do-while condition

        scan.close();
    }
}