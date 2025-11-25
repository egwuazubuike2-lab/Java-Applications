import java.util.Scanner;
public class TemperatureConversions {
    static double celsius(double f) { return 5.0/9.0 * (f - 32); }
    static double fahrenheit(double c) { return 9.0/5.0 * c + 32; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type 'F' to convert F->C or 'C' for C->F: ");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("F")) {
            System.out.print("Fahrenheit: "); double f = sc.nextDouble();
            System.out.printf("Celsius: %.2f%n", celsius(f));
        } else {
            System.out.print("Celsius: "); double c = sc.nextDouble();
            System.out.printf("Fahrenheit: %.2f%n", fahrenheit(c));
        }
        sc.close();
    }
}
