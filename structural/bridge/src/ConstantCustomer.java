public class ConstantCustomer implements Customer{
    @Override
    public void getInfo() {
        System.out.println("--IT'S CONSTANT CUSTOMER--");
    }

    @Override
    public Customer activateCustomer() {
        System.out.println("Reactivating customer");
        return new ConstantCustomer();
    }
}
