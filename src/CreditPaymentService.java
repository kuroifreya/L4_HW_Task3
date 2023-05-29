public class CreditPaymentService {
    public int calculate(int rouble, int months, double percent) {
        int monthlyPayment;
        double monthlyRate = percent / (100 * 12);
        double annuityFactor =
                (monthlyRate * Math.pow((1 + monthlyRate), months)) /
                        (Math.pow((1 + monthlyRate), months) - 1);

        monthlyPayment = (int) (rouble * annuityFactor);

        return monthlyPayment;
    }
}
