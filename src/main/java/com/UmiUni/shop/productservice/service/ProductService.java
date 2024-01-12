package com.UmiUni.shop.productservice.service;

import com.UmiUni.shop.productservice.entity.Product;
import com.UmiUni.shop.productservice.model.ProductWithAttributes;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    Product getProduct(Long id);
    List<Product> getAllProducts();
    Product updateProduct(Long id, Product productDetails);
    void deleteProduct(Long id);

    ProductWithAttributes getProductWithAttributes(Long productId);

    Product findBySkuCode(String skuCode);

    public void reduceProductInventory(String skuCode, int quantity);

    public void lockInventory(String skuCode, int quantity);
}
