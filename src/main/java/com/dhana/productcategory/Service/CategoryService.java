package com.dhana.productcategory.Service;

import com.dhana.productcategory.Repository.CategoryRepository;
import com.dhana.productcategory.model.CategoryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryModel> getAllCategory(){

        try{
            return categoryRepository.findAll();
        } catch (Exception e) {
            System.out.println("Error Message: " +e.getMessage());
            return null;
        }
    }

}



