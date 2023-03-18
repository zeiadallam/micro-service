package com.pick.orderservice.mapper;

import com.pick.orderservice.dto.OrderDto;
import com.pick.orderservice.model.OrderModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class OrderMapper {
   abstract public OrderDto toDto(OrderModel orderModel);
abstract public OrderModel toModel(OrderDto orderDto);

}
