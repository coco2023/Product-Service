package com.UmiUni.shop.productservice.model;

import com.UmiUni.shop.productservice.constant.StockStatus;
import com.UmiUni.shop.productservice.entity.ProductAttribute;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class ProductWithAttributes {

    private Long productId;

    private String productName;

    private String skuCode;

    private Long categoryId;
    private String categoryName;

    private Long brandId;
    private String brandName;

    private Long supplierId;
    private String supplierName;

    private String description;

    private BigDecimal price;

    private String imageUrl;

    private Integer stockQuantity;

    private StockStatus stockStatus;

    private String shippingInfo;

    private LocalDateTime lastStockUpdate;

    private List<ProductAttribute> productAttributeList;

}
