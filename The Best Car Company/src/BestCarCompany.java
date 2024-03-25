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

        displayData();
        sortData();
        displayData();

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

    public static void sortData() {
        for (int i = 0; i < totalSales.length - 1; i++) {
            for (int j = 0; j < totalSales.length - i - 1; j++) {
                if (totalSales[j] > totalSales[j + 1]) {
                    double tempSales = totalSales[j];
                    totalSales[j] = totalSales[j + 1];
                    totalSales[j + 1] = tempSales;

                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;

                    double tempCommission = commission[j];
                    commission[j] = commission[j + 1];
                    commission[j + 1] = tempCommission;
                }
            }
        }
    }

}
