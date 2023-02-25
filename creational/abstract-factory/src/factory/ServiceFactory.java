package factory;

import factory.AbstractFactory;
import product.Product;
import product.ProductType;
import service.Service;
import service.Service1;
import service.Service100;
import service.ServiceGroup;

public class ServiceFactory implements AbstractFactory {
    @Override
    public Service getService(ServiceGroup serviceGroup) {
        Service service;
        switch (serviceGroup) {
            case G1:
                service = new Service1();
                break;
            case G100:
                service = new Service100();
                break;
            default:
                service = null;
        }
        return service;
    }

    @Override
    public Product getProduct(ProductType productType) {
        return null;
    }
}
