// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CustomerTest {
    public static void main(String[] args) {

        Customer customerF = new Customer("Fred");
        System.out.println(customerF.getName());
        customerF.changeDetails("Frederick");
        System.out.println(customerF.getName());
        customerF.changeDetails("FrederickG", 'I');
        System.out.println(customerF.getName());
        System.out.println(customerF.getCustomerStatus());
        System.out.println(customerF.getAccountNumber());

        Customer customerY = new Customer('I', "George");
        System.out.println(customerY.getAccountNumber());
        Customer.setLastUsedAccountNumber(2000);

        customerF = new Customer("Hattie");
        customerY = new Customer('I', "Xander");





    }
}