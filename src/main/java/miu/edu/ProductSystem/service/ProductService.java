package miu.edu.ProductSystem.service;

import miu.edu.ProductSystem.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAllProducts();
    List<Product> findAllProductsSortedByName();
    List<Product> findProductsBySupplierName(String SupplierName);
}
