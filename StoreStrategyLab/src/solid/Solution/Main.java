package solid.Solution;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DiscountTypes sales = new Sales();
        DiscountTypes discount = new Discount();
        DiscountTypes liquidation = new Liquidation();
        List<Customer> orders = new ArrayList<>();
        //Discount types S for Sale, D for Discount, L for Liquidation

        orders.add(new Customer("William Walters", 75.34));
        orders.get(0).setDiscountType(discount);
        orders.add(new Customer("Susan Smothers", 24.12));
        orders.get(1).setDiscountType(sales);
        orders.add(new Customer("Jessica Johnson", 273.93));
        orders.get(2).setDiscountType(liquidation);
        orders.add(new Customer("Richard Ricardo", 171.42));
        orders.get(3).setDiscountType(discount);

        double total=0;
        for(Customer o: orders) {
            System.out.println(o.getCustomerName() + " " + o.getBillAmount() + " " + o.UseDiscountTypeMethod());
            total+= o.getBillAmount();
        }
        System.out.println("Total:    " + total);

    }
}
