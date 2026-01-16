package com.product.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

//  @GeneratedValue(strategy = GenerationType.AUTO)
	
	@Id
    private Integer id;
    private String productName;
    private String manufacturer;
    private Integer availableQuantity;
    private String reorderLevel;
    private String color;
    private String details;

    @OneToOne(cascade = CascadeType.ALL)
    private Supplier supplierDetails;
    
    
}
