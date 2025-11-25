public class PerfectNumbers {
    static boolean isPerfect(int n) {
        int sum = 1;
        for (int i = 2; i <= n/2; i++) if (n % i == 0) sum += i;
        return n != 1 && sum == n;
    }

    public static void main(String[] args) {
        for (int n = 2; n <= 1000; n++) {
            if (isPerfect(n)) {
                System.out.print(n + " factors: ");
                for (int i = 1; i <= n/2; i++) if (n % i == 0) System.out.print(i + " ");
                System.out.println();
            }
        }
    }
}
