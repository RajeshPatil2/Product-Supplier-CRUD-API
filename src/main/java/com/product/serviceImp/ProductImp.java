package com.product.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repository.ProductRepository;
import com.product.serviceI.Product_ServiceI;

import jakarta.transaction.Transactional;

@Service
public class ProductImp implements Product_ServiceI {

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    @Override
    public Product saveData(Product product) {
        System.out.println("Saving Product: " + product);
        Product savedProduct = productRepository.save(product);
        System.out.println("Product Saved: " + savedProduct);
        return savedProduct;
    }

    @Override
    public Product getSingleData(int productId) {
        return productRepository.findById(productId).orElse(null);
    }

    @Override
    public Iterable<Product> getAllproduct() {
        return productRepository.findAll();
    }

    @Override
    public void updateproduct(int productId, Product updatedDetails) {
        if (productRepository.existsById(productId)) {
            productRepository.save(updatedDetails);
        }
    }

    @Override
    public void deleteproduct(int productId) {
        if (productRepository.existsById(productId)) {
            productRepository.deleteById(productId);
        }
    }
}
