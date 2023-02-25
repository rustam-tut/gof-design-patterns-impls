public class ProductFactory {
    Product getProduct(ProductType productType) {
        Product product;

        switch (productType) {
            case A:
                product = new ConcreteProductA();
                break;
            case B:
                product = new ConcreteProductB();
                break;
            case C:
                product = new ConcreteProductC();
                break;
            default:
                product = new ConcreteProductUnknown();
        }
        return product;
    }
}
