package com.pick.orderservice.repository;

import com.pick.orderservice.model.OrderLineItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderLineItem, String> {
}
