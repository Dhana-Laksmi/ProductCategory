package com.dhana.productcategory.Service;

import com.dhana.productcategory.Repository.CustomerRepository;
import com.dhana.productcategory.model.CustomerModel;
import com.dhana.productcategory.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerModel> getAllCustomers(){
        return customerRepository.findAll();
    }
}
