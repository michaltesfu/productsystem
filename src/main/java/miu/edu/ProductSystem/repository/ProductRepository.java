package miu.edu.ProductSystem.repository;

import miu.edu.ProductSystem.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    @Query("SELECT p FROM Product p ORDER BY p.name ASC")
    List<Product> findAllProductsSortedByName();

    @Query("SELECT p FROM Product p WHERE p.SupplierName = :supplierName")
    List<Product> findProductsBySupplierName(String supplierName);

//    @Query("SELECT p FROM Product p WHERE p.SupplierName = :SupplierName")
//    List<Product> findProductsBySupplierName(@Param("supplierId") String SupplierName);
}
