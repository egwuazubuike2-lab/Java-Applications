import java.util.Scanner;
public class MinimumNumbers {
    static double minimum3(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        System.out.println("Smallest: " + minimum3(a,b,c));
        sc.close();
    }
}
