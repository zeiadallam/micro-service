package com.pick.inventoryservice.repository;

import com.pick.inventoryservice.model.InventoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface InventoryRepository extends JpaRepository<InventoryModel, UUID> {
    Optional<InventoryModel> findBySkuCode(String skuCode);
    List<InventoryModel> findBySkuCodeIn(List<String> skuCode);

}
