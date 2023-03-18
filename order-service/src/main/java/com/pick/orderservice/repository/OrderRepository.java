package com.pick.orderservice.repository;

import com.pick.orderservice.model.OrderModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<OrderModel,String> {
}
