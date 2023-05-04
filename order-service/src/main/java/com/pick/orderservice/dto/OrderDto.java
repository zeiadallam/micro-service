package com.pick.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private String orderNumber;
    private String productSerial;
    private String productName;
    private String orderUser;
    private List<OrderLineItemDto> orderLineItemList;
}
