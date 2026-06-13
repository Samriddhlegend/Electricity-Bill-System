import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("----- Sample Bill -----");
        Consumer sampleConsumer = new Consumer(101, "Rahul", 250);

        TariffCalculator calc = new TariffCalculator();
        calc.displayBill(sampleConsumer);

        Scanner sc = new Scanner(System.in);

        System.out.println("\n----- Generate Your Own Bill -----");

        System.out.print("Enter Consumer ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        Consumer consumer = new Consumer(id, name, units);

        System.out.println("\n----- Your Bill -----");
        calc.displayBill(consumer);

        sc.close();
    }
}
