import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating Scanner Object
        // Declearing Variables
        int accountNumber;
        int beginningBalance;
        int totalCharges;
        int totalCredits;
        int creditLimit;

        System.out.print("Enter account number (or -1 to quit): ");
        accountNumber = input.nextInt();

        while (accountNumber != -1) {
            System.out.print("Enter beginning balance: ");
            beginningBalance = input.nextInt();

            System.out.print("Enter total charges: ");
            totalCharges = input.nextInt();

            System.out.print("Enter total credits: ");
            totalCredits = input.nextInt();

            System.out.print("Enter credit limit: ");
            creditLimit = input.nextInt();
			
            // calculating the new account balance
            int newBalance = beginningBalance + totalCharges - totalCredits;

            System.out.printf("New balance is %d%n", newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.\n");
            } else {
                System.out.println("Credit limit not exceeded.\n");
            }

            System.out.print("Enter account number (or -1 to quit): ");
            accountNumber = input.nextInt();
        }

        System.out.println("No more entries. Program ended.");
    }
}
