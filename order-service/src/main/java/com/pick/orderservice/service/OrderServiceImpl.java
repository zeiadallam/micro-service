package com.pick.orderservice.service;

import com.pick.orderservice.dto.InventoryDto;
import com.pick.orderservice.dto.OrderDto;
import com.pick.orderservice.dto.OrderLineItemDto;
import com.pick.orderservice.mapper.OrderMapper;
import com.pick.orderservice.model.OrderModel;
import com.pick.orderservice.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class OrderServiceImpl implements orderService {
    private final OrderRepository orderRepository;
    private final WebClient webClient;
    private final OrderMapper orderMapper;

    /**
     * @param orderDto
     */
    @Override
    public OrderDto placeOrder(OrderDto orderDto) {
        if (isOrderAvailable(orderDto)) {
            OrderModel orderModel = orderMapper.toModel(orderDto);
            return orderMapper.toDto(orderRepository.save(orderModel));
        }
        throw new RuntimeException("Produce Not exist");
    }

    private boolean isOrderAvailable(OrderDto orderDto) {
        List<String> skuCodeList
                = orderDto.getOrderLineItemList()
                .stream().map(OrderLineItemDto::getSkuCode).collect(Collectors.toList());
        InventoryDto[] body =
                webClient.get().uri("http://localhost:8083/api/inventory/product-availability",
                                uriBuilder -> uriBuilder.queryParam("skuCode", skuCodeList).build()).
                        retrieve().bodyToMono(InventoryDto[].class).block();
        assert body != null;
        log.info("ddgdfgdfg{}", body.length);
        return Arrays.stream(body).anyMatch(InventoryDto::isInStock);

    }
}
