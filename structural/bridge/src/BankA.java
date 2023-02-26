public class BankA extends Bank {

    public BankA(Customer customer) {
        super(customer);
    }

    @Override
    Customer activateCustomer() {
        System.out.println("Bank 'A' customer activating");
        return  customer;
    }
}
