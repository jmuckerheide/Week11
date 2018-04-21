package solid.Solution;

public class Liquidation implements DiscountTypes {
    @Override
    public double getBillAmount(double tempBill) {
        return tempBill - (tempBill * 0.75);
    }
}
