public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        int period;
        double rate = 9.99;
        int payment;

        period = 12;
        payment = service.calculate(amount, period, rate);
        System.out.println("Ежемесячный платёж: " + payment + "р.");
        System.out.println();

        period = 24;
        payment = service.calculate(amount, period, rate);
        System.out.println("Ежемесячный платёж: " + payment + "р.");
        System.out.println();

        period = 36;
        payment = service.calculate(amount, period, rate);
        System.out.println("Ежемесячный платёж: " + payment + "р.");
        System.out.println();

    }
}
