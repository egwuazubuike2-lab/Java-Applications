import java.util.Scanner;
import java.util.ArrayList;

public class PropertyManagementSystem{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Property> properties = new ArrayList<>();

        int choice;

        // 1️⃣ DO-WHILE LOOP (menu)
        do {
            System.out.println("\nPROPERTY MANAGEMENT SYSTEM");
            System.out.println("1. Add Properties");
            System.out.println("2. View Properties");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) { // selection statement

                case 1:
                    System.out.println("\nEnter property details");

                    // 2️⃣ SENTINEL CONTROL LOOP
                    while (true) {
                        System.out.print("Enter Property ID (-1 to stop): ");
                        int id = sc.nextInt();

                        if (id == -1) {
                            break; // stops sentinel loop
                        }

                        sc.nextLine();
                        System.out.print("Enter Address: ");
                        String address = sc.nextLine();

                        System.out.print("Enter Rent: ");
                        double rent = sc.nextDouble();

                        // 3️⃣ CONTINUE STATEMENT
                        if (rent <= 0) {
                            System.out.println("Invalid rent! Try again.");
                            continue; // skip saving
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

        sc.close();
    }
}

/* =============================
   REQUIRED CLASS (same file)
   ============================= */
class Property {
    int id;
    String address;
    double rent;

    public Property(int id, String address, double rent) {
        this.id = id;
        this.address = address;
        this.rent = rent;
    }

    public void display() {
        System.out.println("ID: " + id +
                ", Address: " + address +
                ", Rent: " + rent);
    }
}
