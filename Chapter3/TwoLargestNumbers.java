import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;         
        int largest;        
        int secondLargest;  
        int counter = 1;    

        System.out.print("Enter number 1: ");
        largest = input.nextInt();   // initialize with the first number

        System.out.print("Enter number 2: ");
        number = input.nextInt();

        // initialize secondLargest and adjust largest if needed
        if (number > largest) {
            secondLargest = largest;
            largest = number;
        } else {
            secondLargest = number;
        }

        counter = 3;  // we already read 2 numbers

        // process remaining 8 numbers
        while (counter <= 10) {
            System.out.printf("Enter number %d: ", counter);
            number = input.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }

            counter++;
        }

        System.out.printf("%nThe largest number is %d%n", largest);
        System.out.printf("The second largest number is %d%n", secondLargest);
    }
}
