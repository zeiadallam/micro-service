package com.pick.inventoryservice.dto;

import lombok.Data;

@Data
public class InventoryDto {
    private Long id;
    private String inventoryName;
    private int quantity;
    private String skuCode;
}
