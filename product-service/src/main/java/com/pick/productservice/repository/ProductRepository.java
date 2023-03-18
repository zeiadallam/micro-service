package com.pick.productservice.repository;

import com.pick.productservice.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel,Long> {
    Optional<ProductModel> findByProductSerial(String pSerial);
}
