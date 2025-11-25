import java.util.Scanner;

public class ParkingCharges {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("----Welcome to Auto_Perfections_Garage----");

        System.out.print("How many customers parked yesterday? ");
        int customers = input.nextInt();

        double totalDailyCharges = 0;

        for (int i = 1; i <= customers; i++) {

            System.out.printf("%nCustomer %d:%n", i);
            
            System.out.print("Enter car tag number (1 - 100): ");
            int tag = input.nextInt();

            if (tag < 1 || tag > 100) {
                System.out.println("Invalid CarTag! Skipping this customer.");
                continue;
            }

            System.out.print("Enter hours parked: ");
            int hours = input.nextInt();

            double charge = calculateCharges(hours);
            totalDailyCharges += charge;

            System.out.printf("Charge for CarTag %d is $%.2f%n", tag, charge);
        }

        System.out.printf("%nTotal charges collected yesterday: $%.2f%n", totalDailyCharges);
    }


    public static double calculateCharges(int hours) {

        double charge = 2.0;  // Minimum charge for up to 3 hours

        if (hours > 3) {
            charge += (hours - 3) * 0.5;
        }

        // Maximum charge for 24 hours
        if (charge > 10.0) {
            charge = 10.0;
        }

        return charge;
    }
}
