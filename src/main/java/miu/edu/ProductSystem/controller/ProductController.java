package miu.edu.ProductSystem.controller;

import miu.edu.ProductSystem.model.Product;
import miu.edu.ProductSystem.model.Supplier;
import miu.edu.ProductSystem.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findByProductName() {
        return productService.findAllProductsSortedByName();
    }

    @GetMapping("/get/supplier/{SupplierName}")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findProductsBySupplierId(@PathVariable("SupplierName") String SupplierName) {
        return productService.findProductsBySupplierName(SupplierName);
    }

}