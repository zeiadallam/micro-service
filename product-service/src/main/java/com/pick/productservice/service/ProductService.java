package com.pick.productservice.service;

import com.pick.productservice.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto placeOrder(ProductDto productDto);

    List<ProductDto> getAllProducts();

    ProductDto getProductBySerial(String serial);
}
