package com.pick.orderservice.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "orderItems")
@Data
public class OrderLineItem {
    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid2")
    @Column(length = 36, nullable = false, updatable = false,unique = true)
    private String id;
    private String skuCode;
//    @ManyToOne
//    @JoinColumn(name = "order_id", nullable = false)
//    private OrderModel order;
}
