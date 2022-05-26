public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        // amount - сумма кредита
        // percent - процентная ставка по кредиту
        // term - срок кредита в годах

        System.out.println("Ваш ежемесячный платеж по кредиту составляет:");
        System.out.println((int)(service.calculate(1000_000, 9.99, 1)));

        System.out.println("Ваш ежемесячный платеж по кредиту составляет:");
        System.out.println((int)(service.calculate(1000_000, 9.99, 2)));

        System.out.println("Ваш ежемесячный платеж по кредиту составляет:");
        System.out.println((int)(service.calculate(1000_000, 9.99, 3)));
    }
}