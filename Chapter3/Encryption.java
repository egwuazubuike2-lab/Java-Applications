import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a four-digit integer to encrypt: ");
        int number = input.nextInt();

        // Extract digits
        int d1 = (number / 1000) % 10;
        int d2 = (number / 100) % 10;
        int d3 = (number / 10) % 10;
        int d4 = number % 10;

        // Step 1: Add 7 and take remainder mod 10
        d1 = (d1 + 7) % 10;
        d2 = (d2 + 7) % 10;
        d3 = (d3 + 7) % 10;
        d4 = (d4 + 7) % 10;

        // Step 2: Swap first with third, and second with fourth
        int temp;
        temp = d1; d1 = d3; d3 = temp;
        temp = d2; d2 = d4; d4 = temp;

        // Print encrypted number
        System.out.printf("Encrypted number: %d%d%d%d%n", d1, d2, d3, d4);
    }
}
