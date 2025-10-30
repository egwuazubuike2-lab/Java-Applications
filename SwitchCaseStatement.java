import java.util.Scanner;


public class SwitchCaseStatement{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//declearing variables
		int mark;
		String fullName;
		
		System.out.print("Enter your full name: ");
		fullName = input.nextLine();
		
		System.out.print("Enter your mark: ");
		mark = input.nextInt();
		
		switch(mark/10){
			case 0:
			case 1:
			case 2:
			case 3:
			    System.out.printf("FullName: %s, Mark: %d - Your grade is F",fullName,mark);
			break;
			case 4:
			    System.out.printf("FullName: %s, Mark: %d - Your grade is E",fullName,mark);
			case 5:
			    System.out.printf("FullName: %s, Mark: %d - Your grade is D",fullName,mark);
			case 6:
			    System.out.printf("FullName: %s, Mark: %d - Your grade is C",fullName,mark);
			case 7:
			    System.out.printf("FullName: %s, Mark: %d - Your grade is B",fullName,mark);
			case 8:
			case 9:
			case 10:
			    System.out.printf("FullName: %s, Mark: %d - Your grade is A",fullName,mark);
			break;
			default:
			     System.out.println("Invalid input");
			
		}	
	}
}