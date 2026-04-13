public class TariffCalculator {

    public double generateBill(Consumer consumer) {
        int units = consumer.getUnitsConsumed();
        double bill = 0.0;

        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = (100 * 1.5) + ((units - 100) * 2.5);
        } else if (units <= 300) {
            bill = (100 * 1.5) + (100 * 2.5) + ((units - 200) * 4.0);
        } else {
            bill = (100 * 1.5) + (100 * 2.5) + (100 * 4.0) + ((units - 300) * 6.0);
        }
        bill+=125;

        return bill;
    }

    public void displayBill(Consumer consumer) {
        double totalBill = generateBill(consumer);

        System.out.println("Consumer ID: " + consumer.getId());
        System.out.println("Name: " + consumer.getName());
        System.out.println("Units Consumed: " + consumer.getUnitsConsumed());
        System.out.println("Total Electricity Bill: " + totalBill);
    }
}