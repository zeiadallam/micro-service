package com.pick.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderModel {
    @Id
    private String id;
    private String orderNumber;
    private String productSerial;
    private String productName;
    private String orderUser;





}
