public class Main {
    public static void main(String[] args) {
        Consumer consumer = new Consumer(101, "Rahul", 250);
        TariffCalculator calc = new TariffCalculator();
        calc.displayBill(consumer);
    }
}