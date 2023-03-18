package com.pick.orderservice.controller;

import com.pick.orderservice.dto.OrderDto;
import com.pick.orderservice.mapper.OrderMapper;
import com.pick.orderservice.model.OrderModel;
import com.pick.orderservice.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@AllArgsConstructor
@RequestMapping("api/order")
@RestController
public class OrderController {
    private final OrderService orderService;
    private final OrderMapper orderMapper;

    public OrderController(OrderService orderService, OrderMapper orderMapper) {
        this.orderService = orderService;
        this.orderMapper = orderMapper;
    }

    @PostMapping("/add-order")
    public void saveOrder(@RequestBody OrderDto orderDto){
        OrderModel orderModel=orderMapper.toModel(orderDto);
        orderService.saveOrder(orderModel);
    }
}
