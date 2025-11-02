public class CheckerboardPattern {
    public static void main(String[] args) {
        int row = 1;
        
        while (row <= 8) { // Outer loop for rows
            
            if (row % 2 == 0) {
                System.out.print(" "); // Start even rows with a space
            }
            
            int column = 1;
            while (column <= 8) { // Inner loop for columns
                System.out.print("* ");
                column++;
            }
            
            System.out.println(); // Move to next line after each row
            row++;
        }
    }
}
