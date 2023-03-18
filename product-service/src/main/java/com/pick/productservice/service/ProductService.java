package com.pick.productservice.service;

import com.pick.productservice.model.ProductModel;
import com.pick.productservice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    public ProductModel saveOrder(ProductModel productModel){
        Optional<ProductModel> optionalProductModel = productRepository.findByProductSerial(productModel.getProductSerial());
        if (!optionalProductModel.isPresent()){
            return productRepository.save(productModel);
        }else {
            throw new RuntimeException("Serial is already exist");
        }
    }
    public List<ProductModel>getAll(){
        return productRepository.findAll();
    }
    public ProductModel getBySerial(String serial){
        return productRepository.findByProductSerial(serial).orElse(null);
    }
}
