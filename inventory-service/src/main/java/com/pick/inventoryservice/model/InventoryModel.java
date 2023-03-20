package com.pick.inventoryservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "Inventory",
indexes = {
@Index(name ="id",columnList = "id"),
@Index(name ="skuCode",columnList = "skuCode",unique = true)
})
@Data
public class InventoryModel {
    @Id
    private Long id;
    private String inventoryName;
    private int quantity;
    private String skuCode;


}
