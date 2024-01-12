package com.UmiUni.shop.productservice.controller;

import com.UmiUni.shop.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductFeignController {

    @Autowired
    private ProductService productService;

    @PostMapping("/api/products/{skuCode}/lock")
    void lockInventory(@PathVariable String skuCode, @RequestParam int quantity) {
        productService.lockInventory(skuCode, quantity);
    }

    @PostMapping("/api/products/{skuCode}/reduce")
    void reduceProductInventory(@PathVariable String skuCode, @RequestParam int quantity) {
        productService.reduceProductInventory(skuCode, quantity);
    }
}
