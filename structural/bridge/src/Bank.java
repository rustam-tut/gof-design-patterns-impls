public abstract class Bank {
    protected Customer customer;

    public Bank(Customer customer) {
        this.customer = customer;
    }

    abstract Customer activateCustomer();
}
