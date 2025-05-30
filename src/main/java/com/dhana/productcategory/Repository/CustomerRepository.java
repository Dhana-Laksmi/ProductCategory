package com.dhana.productcategory.Repository;

import com.dhana.productcategory.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel,Long> {
}
