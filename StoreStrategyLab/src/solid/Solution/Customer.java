package solid.Solution;

public class Customer {
    private String customerName;
    private double billAmount;
    private DiscountTypes DiscountType;

    public Customer(String customerName, double billAmount) {
        this.customerName = customerName;
        this.billAmount = billAmount;
    }

    public double UseDiscountTypeMethod () {
        return DiscountType.getBillAmount(billAmount);
    }

    public DiscountTypes getDiscountType() {
        return DiscountType;
    }

    public void setDiscountType(DiscountTypes discountType) {
        DiscountType = discountType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
}
