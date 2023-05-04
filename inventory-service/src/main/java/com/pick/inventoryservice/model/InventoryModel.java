package com.pick.inventoryservice.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Table(name = "inventory")
@Data
public class InventoryModel {

    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid2")
    @Column(length = 36, nullable = false, updatable = false, unique = true)
    private UUID id;
    private String inventoryName;
    private int quantity;
    private String skuCode;


}
