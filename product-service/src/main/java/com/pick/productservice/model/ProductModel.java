package com.pick.productservice.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product",
indexes = {
        @Index(name ="id",columnList = "id"),
        @Index(name ="productSerial",columnList = "productSerial",unique = true)
})
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private String productSerial;
    private int productCount;
    private String productCategory;
}
