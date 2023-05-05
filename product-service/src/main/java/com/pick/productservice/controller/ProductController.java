package com.pick.productservice.controller;

import com.pick.productservice.dto.ProductDto;
import com.pick.productservice.service.ProductServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/product")
@AllArgsConstructor
public class ProductController {
    private final ProductServiceImpl productService;

    @PostMapping("/add-product")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity addProduct(@RequestBody ProductDto productDto) {
        return  ResponseEntity.accepted().body(productService.placeOrder(productDto));
    }
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity getAll() {
        return  ResponseEntity.accepted().body( productService.getAllProducts());
    }
    @GetMapping("/get-serial")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity getProductBySerial(@RequestParam  String serial) {
        return  ResponseEntity.accepted().body( productService.getProductBySerial(serial));
    }
}
