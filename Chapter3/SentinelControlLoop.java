import java.util.Scanner;

public class SentinelControlLoop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter -1 to terminate the loop");
		while(true){
			
		    System.out.print("Enter number: ");
			num = input.nextInt();

			if(num == -1){
				break;
			}
			sum += num;
			counter++;

		}
		System.out.printf("The total number is %d%n", sum);
	}
	
}