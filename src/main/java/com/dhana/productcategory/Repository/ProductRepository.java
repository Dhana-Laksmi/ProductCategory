package com.dhana.productcategory.Repository;

import com.dhana.productcategory.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel,Long> {

//    @Query("Select t from TransactionModel t where t.accountModel.id = :id")

    List<ProductModel> findByCategoryId(Long categoryId);
}
