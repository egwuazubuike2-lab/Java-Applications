import java.util.Scanner;
public class CircleArea {
    static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: "); double r = sc.nextDouble();
        System.out.printf("Area = %.4f%n", circleArea(r));
        sc.close();
    }
}
