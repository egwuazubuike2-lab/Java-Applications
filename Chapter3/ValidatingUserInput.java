import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {
            System.out.printf("Enter result for student %d (1 = pass, 2 = fail): ", studentCounter);
            int result = input.nextInt();

            // Input validation loop
            while (result != 1 && result != 2) {
                System.out.print("Invalid input. Please enter 1 (pass) or 2 (fail): ");
                result = input.nextInt();
            }

            if (result == 1)
                passes++;
            else
                failures++;

            studentCounter++;
        }

        System.out.printf("%nPassed: %d%nFailed: %d%n", passes, failures);

        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }
}
