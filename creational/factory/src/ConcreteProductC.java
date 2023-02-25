public class ConcreteProductC implements Product{
    @Override
    public void getProductInfo() {
        System.out.println("IT'S PRODUCT -- C --  " + hashCode());
    }
}
