package com.pick.orderservice.service;

import com.pick.orderservice.dto.OrderDto;

public interface orderService {
    OrderDto placeOrder(OrderDto orderDto);
}
