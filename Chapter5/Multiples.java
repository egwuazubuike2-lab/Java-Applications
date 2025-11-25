import java.util.Scanner;
public class Multiples{
    static boolean isMultiple(int a, int b) {
        if (a == 0) return false; // avoid division by zero; by definition can't be multiple
        return b % a == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pairs (a b), type non-number to quit:");
        while (sc.hasNextInt()) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.printf("%d is %sa multiple of %d%n", b, isMultiple(a,b) ? "" : "not ", a);
        }
        sc.close();
    }
}
