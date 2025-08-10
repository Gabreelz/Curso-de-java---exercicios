package interface2.services;

public class PayPalService implements OnlinePaymentService{
    
    //fee_percentage = 2%
    //Monthly_Interest = 1%

    private static final double FEE_PERCENTAGE = 0.02;
    private static final double MONTHLY_INTEREST = 0.01;

    

    @Override
    public double PaymentFee(double amount) {
        return amount * FEE_PERCENTAGE;
    }

    @Override
    public double interest(double amount, int mounth) {
        return amount * mounth * MONTHLY_INTEREST;
    }
   
}
