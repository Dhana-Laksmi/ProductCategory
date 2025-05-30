package com.dhana.productcategory.Controller;

import com.dhana.productcategory.Service.ProductService;
import com.dhana.productcategory.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<ProductModel> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/category/{categoryId}")
    public List<ProductModel> getProductsByCategory(@PathVariable Long categoryId){
        return productService.getProductsByCategory(categoryId);
    }
}
