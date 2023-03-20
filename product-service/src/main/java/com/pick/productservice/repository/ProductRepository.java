package com.pick.productservice.repository;

import com.pick.productservice.model.ProductModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends MongoRepository<ProductModel,String> {
    Optional<ProductModel> findByProductSerial(String pSerial);
}
