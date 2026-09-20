package com.apshah.ecommerceproduct.controller;

import com.apshah.ecommerceproduct.entity.Product;
import com.apshah.ecommerceproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/showallproducts")
    public List<Product> showAllProducts(){

        return productService.showAllProducts();

    }

    @PostMapping("/addproduct")
    public String addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return "Product added successfully";
    }
}
