public class OperatorsPart3{
	public static void main(String[]args){
		int num1 = 30;
		int num2 = 35;
		int num3 = 17;
		//AND Operator
		boolean result = (num1 > num2) && (num1 > num3);
		System.out.printf("The result is %b%n",result);
		
		//OR Logical Operator
		boolean result2 = (num1 > num2) || (num1 > num3);
		System.out.printf("The result is %b%n",result2);
		
		//NOT Logical Operator
		boolean result3 = !((num1 > num2) && (num1 > num3));
		System.out.printf("The result is %b%n",result3);
		
		//Pre-increment unary operator
		int num4 = 10;
	
		System.out.printf("%d%n",num4);
		System.out.printf("%d%n",++num4);
		
		//Post-increment unary operator
		int num5 = 10;
		System.out.printf("%d%n",num5);
		System.out.printf("%d%n",num5++);
		System.out.printf("%d%n",num5);
		
		
		//Pre-decrement unary operator
		
	
		System.out.printf("%d%n",num4);
		System.out.printf("%d%n",--num4);
		
		//Post-decrement unary operator
		
		System.out.printf("%d%n",num5);
		System.out.printf("%d%n",num5--);
		System.out.printf("%d%n",num5);
	}
}
	