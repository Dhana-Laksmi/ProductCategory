package com.dhana.productcategory.Service;

import com.dhana.productcategory.Controller.ProductController;
import com.dhana.productcategory.Repository.ProductRepository;
import com.dhana.productcategory.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<ProductModel> getAllProducts(){
        return productRepository.findAll();
    }

    public List<ProductModel> getProductsByCategory(Long categoryId ){
        return productRepository.findByCategoryId(categoryId);
    }
}
