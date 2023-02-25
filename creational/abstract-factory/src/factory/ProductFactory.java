package factory;

import factory.AbstractFactory;
import product.*;
import service.Service;
import service.ServiceGroup;

public class ProductFactory implements AbstractFactory {
    @Override
    public Product getProduct(ProductType productType) {
        Product product;
        switch (productType)  {
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
                product = null;
        }
        return product;
    }

    @Override
    public Service getService(ServiceGroup serviceGroup) {
        return null;
    }
}
