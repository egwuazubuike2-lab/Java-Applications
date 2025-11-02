import java.util.Scanner;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        // initial values
        double currentPop = 8.23;   // in billions
        double growthRate = 0.0085; // 0.85% per year

        System.out.printf("Assumed starting world population: %.2f billion%n", currentPop);
        System.out.printf("Assumed annual growth rate: %.2f%% %n", growthRate * 100);

        double targetPop = currentPop * 2.0;

        System.out.println();
        System.out.printf("%4s  %12s   %12s%n", "Year", "Population (billion)", "Increase (billion)");
        System.out.println("----------------------------------------------------");

        for (int year = 1; year <= 75; year++) {
            double newPop = currentPop * (1 + growthRate);
            double increase = newPop - currentPop;

            System.out.printf("%4d  %12.4f   %12.4f%n", year, newPop, increase);

            if (currentPop < targetPop && newPop >= targetPop) {
                System.out.printf(">>> Population doubles in year %d (end‐of‐year).%n", year);
            }

            currentPop = newPop;
        }
    }
}
