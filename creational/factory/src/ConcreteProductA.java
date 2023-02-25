public class ConcreteProductA implements Product{
    @Override
    public void getProductInfo() {
        System.out.println("IT'S PRODUCT -- A --  " + hashCode());
    }
}
