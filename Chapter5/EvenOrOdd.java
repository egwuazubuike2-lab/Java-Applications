import java.util.Scanner;
public class EvenOrOdd {
    static boolean isEven(int n) { return n % 2 == 0; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers (q to quit):");
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.printf("%d is %s%n", n, isEven(n) ? "even" : "odd");
        }
        sc.close();
    }
}
