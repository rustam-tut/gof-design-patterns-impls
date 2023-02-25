package factory;

import product.Product;
import product.ProductType;
import service.Service;
import service.ServiceGroup;

public interface AbstractFactory {
   Service getService(ServiceGroup serviceGroup);

   Product getProduct(ProductType productType);
}
