package inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {

/*        Customer customerLee = new Customer();
        customerLee.setCustomerID(10100);
        customerLee.setCustomerName("Lee");
*/
        VIPCustomer customerKim = new VIPCustomer(1010, "kim", 100);
        customerKim.bonusPoint = 100;

        //System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo());
    }
}
