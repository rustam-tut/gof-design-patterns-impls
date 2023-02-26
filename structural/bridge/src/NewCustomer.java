public class NewCustomer implements Customer{
    @Override
    public void getInfo() {
        System.out.println("--NEW CUSTOMER--");
    }

    @Override
    public Customer activateCustomer() {
        System.out.println("Activating new customer");
        return new NewCustomer();
    }
}
