package com.pick.orderservice.controller;

import com.pick.orderservice.dto.OrderDto;
import com.pick.orderservice.service.OrderServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/order")
@RestController
@AllArgsConstructor
public class OrderController {
    private final OrderServiceImpl orderService;

    @PostMapping("/add-order")
    public void placeOrder(@RequestBody OrderDto orderDto) {
        orderService.placeOrder(orderDto);
    }
}
