
public class BestCarCompany {

    private static final String[] names = { "James Boyd", "Mpho Baloyi", "Timothy Ryan", "Daniel Ramogotshi",
            "William Seimela", "Harold Xaba", "Miller Bentley", "Sam Sithole", "Richard Frey", "Peter Sebata" };
    private static final double[] totalSales = { 40000.00, 54321.00, 12345.60, 60444.40, 23457.80, 43222.30, 12444.00,
            12444.00, 23555.00, 45666.00, 18982.30 };
    // Declare the commission array
    private static double[] commission = new double[10];

    public static void main(String[] args) {
        for (int i = 0; i < totalSales.length; i++) {
            commission[i] = calculateCommission(totalSales[i]);
        }

    }

    public static double calculateCommission(double totalSales) {
        if (totalSales < 20000) {
            return totalSales * 0.03; // 3% of sales
        } else if (totalSales < 50000) {
            return totalSales * 0.05; // 5% of sales
        } else {
            return totalSales * 0.09; // 9% of sales
        }
    }

    public static void displayData() {
        double totalSalesSum = 0;
        double totalCommissionSum = 0;

        for (int i = 0; i < names.length; i++) {
            System.out.println(
                    "Name: " + names[i] + ", Total Sales: " + totalSales[i] + ", Commission: " + commission[i]);
            totalSalesSum += totalSales[i];
            totalCommissionSum += commission[i];
        }

        System.out.println("Total Sales: " + totalSalesSum + ", Total Commission: " + totalCommissionSum);
    }
}
