package com.product.serviceI;

import com.product.model.Product;

public interface Product_ServiceI {

    Product saveData(Product product);

    Product getSingleData(int productId);

    Iterable<Product> getAllproduct();

    void updateproduct(int productId, Product updatedDetails);

    void deleteproduct(int productId);
}
