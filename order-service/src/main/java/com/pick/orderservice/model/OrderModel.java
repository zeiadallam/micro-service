package com.pick.orderservice.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.Set;


@Entity
@Table(name = "orders")
@Data
public class OrderModel {
    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid2")
    @Column(length = 36, nullable = false, updatable = false,unique = true)
    private String orderId;
    private String orderNumber;
    private String productSerial;
    private String productName;
    private String orderUser;
    @OneToMany(cascade = CascadeType.PERSIST,orphanRemoval = true)
    @JoinColumn(name = "order_id", nullable = false)

    private Set<OrderLineItem> orderLineItemList;


}
