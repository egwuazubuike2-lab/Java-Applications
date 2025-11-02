import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int employeeCount = 1;

        while (employeeCount <= 3) {
            System.out.printf("Enter details for employee %d:%n", employeeCount);

            System.out.print("Enter hours worked: ");
            double hours = input.nextDouble();

            System.out.print("Enter hourly rate: ");
            double rate = input.nextDouble();

            double grossPay;

            if (hours <= 40)
                grossPay = hours * rate;
            else
                grossPay = (40 * rate) + ((hours - 40) * rate * 1.5);

            System.out.printf("Gross pay for employee %d is: $%.2f%n%n", employeeCount, grossPay);

            employeeCount++;
        }

        System.out.println("All employee salaries calculated. Program ended.");
    }
}
