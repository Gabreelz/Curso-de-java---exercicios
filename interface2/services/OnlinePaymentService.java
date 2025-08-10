package interface2.services;

public interface OnlinePaymentService {
    double PaymentFee(double amount);
    double interest(double amount, int mounth);
}
