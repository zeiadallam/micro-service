package com.pick.inventoryservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryRequest {
    private String inventoryName;
    private int quantity;
    private String skuCode;
}
