package com.dhana.productcategory.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@Getter
@Setter
@AllArgsConstructor@NoArgsConstructor
@Table(name = "Customers")
public class CustomerModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String customerName;
    private String address;
    private int mobile;
    private String email;
}
