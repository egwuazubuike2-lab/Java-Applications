import java.util.Scanner;
public class Exponentiation {
    static long integerPower(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) result *= base;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: "); int base = sc.nextInt();
        System.out.print("Exponent (positive): "); int exp = sc.nextInt();
        System.out.println(base + "^" + exp + " = " + integerPower(base, exp));
        sc.close();
    }
}
