import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;   // counts how many numbers have been entered
        int number;        // current number input by user
        int largest;       // largest number found so far

        System.out.print("Enter number 1: ");
        largest = input.nextInt();  // initialize largest with the first input

        counter = 2;  // start counter at 2 since first number is already read

        while (counter <= 10) {
            System.out.printf("Enter number %d: ", counter);
            number = input.nextInt();

            if (number > largest)
                largest = number;

            counter++;
        }

        System.out.printf("%nThe largest number is %d%n", largest);
    }
}
