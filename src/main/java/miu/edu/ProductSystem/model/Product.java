package miu.edu.ProductSystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Products Data")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long productId;

    private String name;
    private double unitPrice;
    private int quantityInStock;
    private LocalDate dateSupplied;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplierId")
    private Supplier supplier;


}
