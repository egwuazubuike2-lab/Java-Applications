
import java.util.Scanner;

public class InfiniteCount{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int num;
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount = 0;
		
		System.out.print("Enter -1 to terminate the loop: ");
		
		while(true){
			
			System.out.print("Enter number: ");
			num = input.nextInt();
			
			if(num == -1){
				break;
			}
			if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
		counter++;
		System.out.printf("The total of the % number(s) is %d%n",counter,positiveCount,negativeCount,zeroCount);
			
			
			
		
	}
}
	