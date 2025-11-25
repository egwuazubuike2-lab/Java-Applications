import java.util.Scanner;

public class RoundingNumbers2 {
    static double roundToInteger(double x) {
        return Math.floor(x + 0.5);
    }
    static double roundToTenths(double x) {
        return Math.floor(x * 10 + 0.5) / 10.0;
    }
    static double roundToHundredths(double x) {
        return Math.floor(x * 100 + 0.5) / 100.0;
    }
    static double roundToThousandths(double x) {
        return Math.floor(x * 1000 + 0.5) / 1000.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (type 'q' to quit):");
        while (sc.hasNext()) {
            if (sc.hasNextDouble()) {
                double x = sc.nextDouble();
                System.out.printf("Original: %f%nInteger: %.0f%nTenths: %f%nHundredths: %f%nThousandths: %f%n%n",
                        x,
                        roundToInteger(x),
                        roundToTenths(x),
                        roundToHundredths(x),
                        roundToThousandths(x));
            } else {
                if (sc.next().equalsIgnoreCase("q")) break;
            }
        }
        sc.close();
    }
}
