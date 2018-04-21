package solid.Solution;

public class Discount implements DiscountTypes {

    @Override
    public double getBillAmount(double tempBill) {
       return tempBill - (tempBill * 0.5);
    }
}
