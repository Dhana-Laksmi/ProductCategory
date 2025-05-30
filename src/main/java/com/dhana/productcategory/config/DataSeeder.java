package com.dhana.productcategory.config;

import ch.qos.logback.classic.Logger;
import com.dhana.productcategory.Repository.CategoryRepository;
import com.dhana.productcategory.Repository.CustomerRepository;
import com.dhana.productcategory.Repository.ProductRepository;
import com.dhana.productcategory.model.CategoryModel;
import com.dhana.productcategory.model.CustomerModel;
import com.dhana.productcategory.model.ProductModel;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {

        //Clear all Existing data
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        //Create a Category

        CategoryModel electronics=new CategoryModel();
        electronics.setCategoryName("Electronics");

        CategoryModel clothes=new CategoryModel();
        clothes.setCategoryName("Clothes");

        CategoryModel homeItems=new CategoryModel();
        homeItems.setCategoryName("Home and Kitchens");

        //categoryRepository.saveAll(Arrays.asList(electronics,clothes,homeItems));
        categoryRepository.save(homeItems);
        categoryRepository.save(clothes);
        categoryRepository.save(electronics);

        //Create a Products

        System.out.println("I am Here");

        ProductModel phones=new ProductModel();
        phones.setName("Iphone");
        phones.setDesc("This is Iphone with Latest Model");
        phones.setImageUrl("https://placehold.co/600x400");
        phones.setPrice(75000.65);
        phones.setCategory(electronics);

        ProductModel womenClothes=new ProductModel();
        womenClothes.setCategory(clothes);
        womenClothes.setName("Sarees");
        womenClothes.setDesc("This is Ladies Dresses");
        womenClothes.setPrice(675.10);
        womenClothes.setImageUrl("https://placehold.co/600x400");

        ProductModel menClothes=new ProductModel();
        menClothes.setCategory(clothes);
        menClothes.setName("Shirt");
        menClothes.setDesc("This is Mens Shirt");
        menClothes.setPrice(865.10);
        menClothes.setImageUrl("https://placehold.co/600x400");

        ProductModel kitchenItems=new ProductModel();
        kitchenItems.setCategory(homeItems);
        kitchenItems.setName("Blender");
        kitchenItems.setDesc("This is Blender which is using in the Kitchen");
        kitchenItems.setPrice(246.1);
        kitchenItems.setImageUrl("https://placehold.co/600x400");

        ProductModel decor=new ProductModel();
        decor.setCategory(homeItems);
        decor.setName("Artificial Flowers");
        decor.setDesc("This is Artificial Flowers which is using for the decartion");
        decor.setPrice(167.3);
        decor.setImageUrl("https://placehold.co/600x400");

        productRepository.saveAll(Arrays.asList(phones,womenClothes,menClothes,kitchenItems,decor));
        //productRepository.save(decar);

        CustomerModel cus1=new CustomerModel();
        cus1.setCustomerName("Dhana");
        cus1.setEmail("deivadhana@gmail.com");
        cus1.setAddress("add1");
        cus1.setMobile(433333);

        CustomerModel cus2=new CustomerModel();
        cus2.setCustomerName("Lakshmi");
        cus2.setEmail("deivadhana@gmail.com");
        cus2.setAddress("add2");
        cus2.setMobile(433333);

        CustomerModel cus3=new CustomerModel();
        cus3.setCustomerName("Pukazhini");
        cus3.setEmail("deivadhana@gmail.com");
        cus3.setAddress("add3");
        cus3.setMobile(433333);


        customerRepository.saveAll(Arrays.asList(cus1,cus2,cus3));
    }
}
