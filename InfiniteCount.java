
import java.util.Scanner;

public class InfiniteCount{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int number;
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount = 0;
		
		System.out.print("Enter -1 to terminate the loop: ");
		
		while(true){
			
			System.out.print("Enter number: ");
			number = input.nextInt();
			
			if(number == -1){
				break;
			}
			if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
		    System.out.printf("The total of the % number(s) is %d%n",positiveCount,negativeCount,zeroCount);
		}	
			
			
		
	}
}
	