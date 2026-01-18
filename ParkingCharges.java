import java.util.Scanner;

public class ParkingCharges {
    
    // Method for calculating parking charge for one customer
    public static double calculateCharges(double hours) {
        double charge = 2.0;  // minimum charge
        
        if (hours > 3.0) {
            charge += 0.5 * (Math.ceil(hours) - 3.0); // charge extra per hour (or part)
        }
        
        if (charge > 10.0) {
            charge = 10.0;  // maximum charge
        }
        
        return charge;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0;
        char moreCustomers = 'y';
        int customerNumber = 1;
        
        while (moreCustomers == 'y' || moreCustomers == 'Y') {
            System.out.printf("Enter hours parked for customer %d: ", customerNumber);
            double hours = input.nextDouble();
            
            double charge = calculateCharges(hours);
            totalReceipts += charge;
            
            System.out.printf("Customer %d charge: $%.2f%n", customerNumber, charge);
            
            System.out.print("Do you want to enter another customer? (y/n): ");
            moreCustomers = input.next().charAt(0);
            
            customerNumber++;
            System.out.println();
        }
        
        System.out.printf("Total receipts for yesterday: $%.2f%n", totalReceipts);
        
        input.close();
    }
}
