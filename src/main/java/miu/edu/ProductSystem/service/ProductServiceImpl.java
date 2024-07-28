package miu.edu.ProductSystem.service;

import miu.edu.ProductSystem.model.Product;
import miu.edu.ProductSystem.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> findAllProductsSortedByName() {
        return productRepository.findAllProductsSortedByName();
    }

    @Override
    public List<Product> findProductsBySupplierName(String SupplierName) {
        return productRepository.findProductsBySupplierName(SupplierName);
    }


}
