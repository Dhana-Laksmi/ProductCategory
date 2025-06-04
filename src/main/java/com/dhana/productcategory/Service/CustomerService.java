package com.dhana.productcategory.Service;

import com.dhana.productcategory.Repository.CustomerRepository;
import com.dhana.productcategory.model.CustomerModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private static final Logger logger= LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    private CustomerRepository customerRepository;

    public Page<CustomerModel> getAllCustomers(int page, int size){
        try {
            System.out.println("Into Service Layer");
            Pageable pageable= PageRequest.of(page,size);
            return customerRepository.findAll(pageable);

        } catch (Exception e) {
            logger.error("An error occurred while fetching all customer details: {}",e.getMessage(),e);
            return null;
        }
    }
}
