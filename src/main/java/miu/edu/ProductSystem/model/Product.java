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
@Table(name = "products data")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long productId;

    private String name;
    private double price;
    private int quantity;
    private LocalDate supplied;
    private LocalDate expiry;


    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;


}
