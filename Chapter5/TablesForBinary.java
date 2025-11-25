public class TablesForBinary {
    public static void main(String[] args) {
        System.out.printf("%6s %10s %8s %8s%n","Decimal","Binary","Octal","Hex");
        for (int i = 1; i <= 256; i++) {
            System.out.printf("%6d %10s %8s %8s%n", i,
                    Integer.toBinaryString(i),
                    Integer.toOctalString(i),
                    Integer.toHexString(i).toUpperCase());
        }
    }
}
