package com.pick.orderservice.service;

import com.pick.orderservice.dto.OrderDto;

public interface orderService {
    void placeOrder(OrderDto orderDto);
}
