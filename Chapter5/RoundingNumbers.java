import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.println("Enter double values (type 'q' to quit):");
		
        while (input.hasNext()) {
            if (input.hasNextDouble()) {
                double x = input.nextDouble();
                double y = Math.floor(x + 0.5);
                System.out.printf("Original: %f  Rounded: %.0f%n", x, y);
            } else {
                String token = input.next();
                if (token.equalsIgnoreCase("q")) break;
                System.out.println("Enter number or 'q' to quit.");
            }
        }
        input.close();
    }
}
