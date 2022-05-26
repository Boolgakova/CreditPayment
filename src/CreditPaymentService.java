public class CreditPaymentService {
   double termInMonths; //срок кредита в месцах
    double monthlyRate; //месячная ставка по кредиту
    double monthlyPayment; //ежемесячный платеж
    double denominator; //знаменатель в формуле рассчета ежемесячного платежа

    public double calculate(double amount, double percent, double term) {
        termInMonths = term * 12;
        monthlyRate = percent / (100 * 12);
        denominator = 1 - Math.pow((1 + monthlyRate), (termInMonths - (termInMonths * 2)));
        monthlyPayment = amount * (monthlyRate / denominator);
        return monthlyPayment;

    }
}
