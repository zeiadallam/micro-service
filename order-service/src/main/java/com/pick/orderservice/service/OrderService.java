package com.pick.orderservice.service;

import com.pick.orderservice.model.OrderModel;
import com.pick.orderservice.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public void saveOrder(OrderModel orderModel){
        orderRepository.save(orderModel);
    }
}
