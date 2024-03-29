package com.UmiUni.shop.productservice.service;


import com.UmiUni.shop.productservice.entity.ProductAttribute;

import java.util.List;

public interface ProductAttributeService {
    ProductAttribute createProductAttribute(ProductAttribute productAttribute);
    ProductAttribute getProductAttribute(Long id);
    List<ProductAttribute> getAllProductAttributes();
    ProductAttribute updateProductAttribute(Long id, ProductAttribute productAttributeDetails);
    void deleteProductAttribute(Long id);

    List<ProductAttribute> getProductAttributesByProductId(Long productId);
}
