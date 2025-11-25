import java.util.Scanner;

public class ParkingCharges2 {
	public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  
	  System.out.println("---Simple_Calculator---");
	  
	  double output = 0;
	  
	  System.out.print("|Enter any operator(+,-,*,/): ");
	  char operator = input.next().charAt(0);
	  
	  System.out.print("|Enter the first number: ");
	  int num1 = input.nextInt();
	  
	  System.out.print("|Enter the second number: ");
	  int num2 = input.nextInt();
	  
	  if(operator == '+') {
		output = num1 + num2;
		
	  }	else if(operator == '-') {
		output = num1 - num2;
		
	  }	else if(operator == '*') {
		output = num1 * num2;
	  }	
	    else if(operator == '/') {
		output = num1 / num2;
		if(num2 == 0) {
		System.out.print("This is invalid!");	
		} else {
		 output = num1/num2;
		} 
	  }	
	  System.out.printf("The output is: %.1f",output);
	}
}	
	
	
	
     
	