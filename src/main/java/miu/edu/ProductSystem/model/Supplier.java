package miu.edu.ProductSystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Supplier {
    @Id
    @GeneratedValue
    private Integer supplierId;
    @Column(name ="SupplierController Name ")
    private String name;
    private String contactPhone;

    @OneToMany(mappedBy = "product")
    private List<Product> products;
}
