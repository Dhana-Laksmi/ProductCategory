package com.dhana.productcategory.Controller;

import com.dhana.productcategory.Service.CustomerService;
import com.dhana.productcategory.model.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public Page<CustomerModel> getALlCustomers(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size){
        return customerService.getAllCustomers(page,size);
    }


}
