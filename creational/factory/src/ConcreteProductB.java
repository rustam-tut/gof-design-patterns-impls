public class ConcreteProductB implements Product {

    @Override
    public void getProductInfo() {
        System.out.println("IT'S PRODUCT -- B --  " + hashCode());
    }
}
