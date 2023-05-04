package com.pick.orderservice.dto;

import lombok.Data;

@Data
public class InventoryDto {
    private boolean isInStock ;
    private String skuCode;
}