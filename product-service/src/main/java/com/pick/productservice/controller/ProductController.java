package com.pick.productservice.controller;

import com.pick.productservice.dto.ProductDto;
import com.pick.productservice.mapper.ProductMapper;
import com.pick.productservice.model.ProductModel;
import com.pick.productservice.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/product")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;
    private final ProductMapper productMapper;

    @PostMapping("/add-product")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity addProduct(@RequestBody ProductDto productDto) {
        ProductModel productModel = productMapper.toModel(productDto);
        return  ResponseEntity.accepted().body( productMapper.toDto(productService.saveOrder(productModel)));
    }
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity getAll() {
        return  ResponseEntity.accepted().body( productMapper.toDto(productService.getAll()));
    }
    @GetMapping("/get-serial")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity getProductBySerial(@RequestParam  String serial) {
        return  ResponseEntity.accepted().body( productMapper.toDto(productService.getBySerial(serial)));
    }
}
