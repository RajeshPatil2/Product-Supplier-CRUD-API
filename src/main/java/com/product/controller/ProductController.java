package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.product.model.Product;
import com.product.serviceI.Product_ServiceI;

@CrossOrigin("http://localhost:4200")  // Allows requests from the Angular fronted running on localhost:3000
@RestController
public class ProductController {

    @Autowired
    private Product_ServiceI productServiceI;

    @PostMapping("/save_product")
    public ResponseEntity<Product> postProduct(@RequestBody Product product) {
    	
        Product savedProduct = productServiceI.saveData(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    @GetMapping("/view_product/{id}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable("id") int productId) {
        Product product = productServiceI.getSingleData(productId);
        if (product != null) {
            return ResponseEntity.ok(product);
        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND);
        		return null;
        }
    }

    @GetMapping("/view_product")
    public ResponseEntity<Iterable<Product>> getAllProducts() {
        Iterable<Product> products = productServiceI.getAllproduct();
        return ResponseEntity.ok(products);
    }

    @PutMapping("/postproduct/{productId}")
    public ResponseEntity<String> updateProduct(@PathVariable int productId, @RequestBody Product updatedDetails) {
        Product existingProduct = productServiceI.getSingleData(productId);
        if (existingProduct != null) {
            productServiceI.updateproduct(productId, updatedDetails);
            return ResponseEntity.ok("Updated Product [ID: " + productId + "] Successfully..!!");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found.");
        }
    }

    @DeleteMapping("/postproduct/{productId}")
    public ResponseEntity<String> deleteProduct(@PathVariable int productId) {
        Product existingProduct = productServiceI.getSingleData(productId);
        if (existingProduct != null) {
            productServiceI.deleteproduct(productId);
            return ResponseEntity.ok("Deleted Product [ID: " + productId + "] Successfully..!!");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found.");
        }
    }
}
