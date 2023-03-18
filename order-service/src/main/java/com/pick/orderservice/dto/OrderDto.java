package com.pick.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private String orderNumber;
    private String productSerial;
    private String productName;
    private String orderUser;
}
