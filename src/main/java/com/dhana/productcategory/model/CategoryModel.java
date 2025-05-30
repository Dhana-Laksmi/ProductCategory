package com.dhana.productcategory.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category")
public class CategoryModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String categoryName;

//    public CategoryModel(Long id, String categoryName, Set<ProductModel> products) {
//        this.id = id;
//        this.categoryName = categoryName;
//        this.products = products;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getCategoryName() {
//        return categoryName;
//    }
//
//    public void setCategoryName(String categoryName) {
//        this.categoryName = categoryName;
//    }
//
//    public Set<ProductModel> getProducts() {
//        return products;
//    }
//
//    public void setProducts(Set<ProductModel> products) {
//        this.products = products;
//    }

    @OneToMany(mappedBy = "category",
               cascade = CascadeType.ALL,
                fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<ProductModel> products;
}
