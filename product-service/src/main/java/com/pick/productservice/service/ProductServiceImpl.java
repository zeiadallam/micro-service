package com.pick.productservice.service;

import com.pick.productservice.dto.ProductDto;
import com.pick.productservice.mapper.ProductMapper;
import com.pick.productservice.model.ProductModel;
import com.pick.productservice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;


    @Override
    public ProductDto placeOrder(ProductDto productDto) {
        ProductModel productModel = productMapper.toModel(productDto);
        Optional<ProductModel> optionalProductModel = productRepository
                .findByProductSerial(productModel.getProductSerial());
        if (!optionalProductModel.isPresent()) {
            return productMapper.toDto(productRepository.save(productModel));
        } else {
            throw new RuntimeException("Serial is already exist");
        }
    }

    @Override
    public List<ProductDto> getAllProducts() {
        return productMapper.toDto(productRepository.findAll());
    }

    @Override
    public ProductDto getProductBySerial(String serial) {
        return productMapper.toDto(productRepository.findByProductSerial(serial).orElse(null));
    }
}
