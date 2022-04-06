package inheritance;

public class OverridingTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "Lee");
        customerLee.calcPrice(10000);
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10011, "Kim", 100);
        customerKim.calcPrice(10000);
        System.out.println(customerKim.showCustomerInfo());
    }
}
