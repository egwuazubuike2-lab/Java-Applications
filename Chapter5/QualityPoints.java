import java.util.Scanner;
public class QualityPoints {
    static int qualityPoints(int avg) {
        if (avg >= 90) return 4;
        if (avg >= 80) return 3;
        if (avg >= 70) return 2;
        if (avg >= 60) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter average (0-100): ");
        int a = sc.nextInt();
        System.out.println("Quality points: " + qualityPoints(a));
        sc.close();
    }
}
