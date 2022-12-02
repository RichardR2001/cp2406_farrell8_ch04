// Billing.java

public class Billing
{
    static final double TAX = 0.08;
    public static void main(String[] args)
    {
        double bill;
        bill = computeBill(5);
        System.out.println("The total due is: " + bill);
        bill = computeBill(5, 2);
        System.out.println("The total due is: " + bill);
        bill = computeBill(5, 2, 3);
        System.out.println("The total due is: " + bill);
    }
    public static double computeBill(double amt)
    {
        double bill = amt;
        bill = bill + (bill * TAX);
        return bill;
    }
    public static double computeBill(double amt, int qty)
    {
        double bill = amt*qty ;
        bill = bill + (bill * TAX);
        return bill;
    }
    public static double computeBill(double amt, int qty, double coupon)
    {
        double bill = (amt*qty) - coupon;
        bill = bill + (bill * TAX);
        return bill;
    }
}
