package com.pick.orderservice.mapper;

import com.pick.orderservice.dto.OrderDto;
import com.pick.orderservice.dto.OrderLineItemDto;
import com.pick.orderservice.model.OrderLineItem;
import com.pick.orderservice.model.OrderModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDto toDto(OrderModel orderModel);

    OrderModel toModel(OrderDto orderDto);

    abstract public OrderLineItem orderLineItemDto(OrderLineItemDto orderDto);

    List<OrderLineItem> orderLineItemDto(List<OrderLineItemDto> orderDto);

}
