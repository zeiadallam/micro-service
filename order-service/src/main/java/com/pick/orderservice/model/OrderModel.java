package com.pick.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order",
        indexes = {
                @Index(name ="id",columnList = "id"),
                @Index(name ="productSerial",columnList = "productSerial",unique = true)
        })
public class OrderModel {
    @Id
    private Long id;
    private String orderNumber;
    private String productSerial;
    private String productName;
    private String orderUser;


}
