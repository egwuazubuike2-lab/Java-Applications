import java.util.Scanner;

public class GasPerMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Creating Scanner Object

        int miles;            // miles driven for one trip
        int gallons;          // gallons used for one trip
        int totalMiles = 0;   // total of miles for all trips
        int totalGallons = 0; // total of gallons for all trips

        System.out.print("Enter miles driven (-1 to quit): ");
        miles = input.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();

            double milesPerGallon = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", milesPerGallon);

            totalMiles += miles;
            totalGallons += gallons;

            double overallMPG = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon so far: %.2f%n%n", overallMPG);

            System.out.print("Enter miles driven (-1 to quit): ");
            miles = input.nextInt();
        }

        System.out.println("No more entries. Program ended.");
    }
}

	//Exercise2 3.17