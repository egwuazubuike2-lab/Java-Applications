import java.util.Scanner;

public class UsingSquareRoot{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number of your choice: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter any number of your choice: ");
		int num2 = input.nextInt();
		
		System.out.printf("Enter any number to find the square root: ");
		int squareRootNum = input.nextInt();
		
		int castedSquareRootNum = (int)Math.sqrt(squareRootNum);
		
		//output
		System.out.printf("The absolute value of the number is %d%n",Math.abs(num1),Math.abs(num2));
		System.out.printf("The maximum number is %d%n",Math.max(num1,num2));
		System.out.printf("The minimum number is %d%n",Math.min(num1,num2));
		System.out.printf("The square root is %f%n",Math.sqrt(squareRootNum));
	}
}