package solid.Solution;

public class Sales implements DiscountTypes {

    @Override
    public double getBillAmount(double tempBill) {
       return tempBill - (tempBill * 0.1);
    }
}
