package com.pick.productservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document

public class ProductModel {
    @Id
    private String  id;
    private String productName;
    private String productSerial;
    private int productCount;
    private String productCategory;
}
