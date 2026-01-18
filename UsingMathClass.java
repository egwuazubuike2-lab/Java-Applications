import java.util.Scanner;
// Absolute value
public class UsingMathClass{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number of your choice: ");
		int num = input.nextInt();
		
		System.out.printf("The absolute value of the number is %d%n",Math.abs(num));
	}
}