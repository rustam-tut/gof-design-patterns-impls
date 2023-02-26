public class BankB extends Bank{

    public BankB(Customer customer) {
        super(customer);
    }

    @Override
    Customer activateCustomer() {
        System.out.println("Bank 'B' customer activating");
        return customer;
    }
}
