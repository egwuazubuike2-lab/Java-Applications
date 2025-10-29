public class OperatorsPart2{
	public static void main(String[]args){


//Arithmetic operators
		int num1 = 10;
		int num2 = 4;
		String name = "Powr";
		
		int sum = num1 + num2;
		int product = num1 * num2;
		int minus = num1 - num2;
		double divide = (double)num1/num2;
		int modulus = num1%num2;
		
		System.out.printf("Sum is %d%n", sum);
		System.out.printf("Product is %d%n", product);
		System.out.printf("Difference btw num1 and num2 is %d%n", minus);
		System.out.println(name + sum);
		System.out.printf("Result is %f%n", divide);
		System.out.printf("Modulus is %d%n", modulus);
		
		//Relational Operators
		int firstNum = 12;
		int secondNum = 15;
		boolean isGreater = firstNum > secondNum;
		boolean isLesser = firstNum < secondNum;
		boolean isGreaterThanOrEqualTo = firstNum >= secondNum;
		boolean isLesserThanOrEqualTo = firstNum <= secondNum;
		boolean isNotEqualTo = firstNum != secondNum;
		boolean isEqualTo = firstNum == secondNum;
		
		System.out.printf("is firstNum > secondNum? %b%n",isGreater);
		System.out.printf("is firstNum < secondNum? %b%n",isLesser);
		System.out.printf("is firstNum >= secondNum? %b%n",isGreaterThanOrEqualTo);
		System.out.printf("is firstNum <= secondNum? %b%n",isLesserThanOrEqualTo);
		System.out.printf("is firstNum != secondNum? %b%n",isNotEqualTo);
		System.out.printf("is firstNum == secondNum? %b%n",isEqualTo);
	}
}