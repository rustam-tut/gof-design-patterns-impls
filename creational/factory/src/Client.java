

public class Client {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        Product productA1 = productFactory.getProduct(ProductType.A);
        Product productA2 = productFactory.getProduct(ProductType.A);

        Product productB1 = productFactory.getProduct(ProductType.B);
        Product productB2 = productFactory.getProduct(ProductType.B);

        Product productC1 = productFactory.getProduct(ProductType.C);
        Product productC2 = productFactory.getProduct(ProductType.C);
        
        Product product404 = productFactory.getProduct(ProductType.UNKNOWN);

        product404.getProductInfo();
        productA1.getProductInfo();
        productA2.getProductInfo();
        productC1.getProductInfo();
        productC2.getProductInfo();
        productB2.getProductInfo();
        productB1.getProductInfo();
    }
}