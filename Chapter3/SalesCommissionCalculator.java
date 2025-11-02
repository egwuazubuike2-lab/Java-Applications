import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double itemValue;       // value of one item sold
        double totalSales = 0;  // total value of all items sold

        System.out.print("Enter value of item sold (-1 to end): ");//using sentinel value
        itemValue = input.nextDouble();

        while (itemValue != -1) {
            grossSales += itemValue;

            System.out.print("Enter value of next item sold (-1 to end): ");
            itemValue = input.nextDouble();
        }

        double earnings = 200 + (0.09 * grossSales);

        System.out.printf("%nTotal sales: $%.2f%n", grossSales);
        System.out.printf("Earnings for the week: $%.2f%n", earnings);
    }
}
