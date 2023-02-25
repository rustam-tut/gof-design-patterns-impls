import factory.AbstractFactory;
import factory.ProductFactory;
import factory.ServiceFactory;
import product.Product;
import product.ProductType;
import service.Service;
import service.ServiceGroup;

public class Client {
    public static void main(String[] args) {
        AbstractFactory serviceFactory = new ServiceFactory();
        AbstractFactory productFactory = new ProductFactory();

        Service s1_1 = serviceFactory.getService(ServiceGroup.G1);
        Service s1_2 = serviceFactory.getService(ServiceGroup.G1);
        Service s100 = serviceFactory.getService(ServiceGroup.G100);

        Product pA = productFactory.getProduct(ProductType.A);
        Product pB1 = productFactory.getProduct(ProductType.B);
        Product pB2 = productFactory.getProduct(ProductType.B);
        Product pC1 = productFactory.getProduct(ProductType.C);
        Product pC2 = productFactory.getProduct(ProductType.C);
        Product pC3 = productFactory.getProduct(ProductType.C);

        s1_1.getServiceDescription();
        s1_2.getServiceDescription();
        s100.getServiceDescription();

        pA.getProductInfo();
        pB1.getProductInfo();
        pB2.getProductInfo();
        pC1.getProductInfo();
        pC2.getProductInfo();
        pC3.getProductInfo();
    }
}