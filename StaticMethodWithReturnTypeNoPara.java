public class StaticMethodWithReturnTypeNoPara{ //With return type but no parameter
	public static void main(String[] args){
		int result = addition();
		System.out.printf("The result is %d%n", result);
	}
	public static int addition(){
		int num1 = 16;
		int num2 = 8;
		int num3 = 90;
		
		int sum = num1 + num2 + num3;
		
		return sum;
	}
}