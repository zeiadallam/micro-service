package com.pick.inventoryservice.service;

import com.pick.inventoryservice.model.InventoryModel;
import com.pick.inventoryservice.repository.InventoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public InventoryModel addToInventory(InventoryModel inventoryModel) {
        InventoryModel model = inventoryRepository.findBySkuCode(inventoryModel.getSkuCode()).orElse(null);
        if (model == null) {
            return inventoryRepository.save(inventoryModel);
        } else {
            throw new RuntimeException("SkuCode already exist");
        }
    }
    public List<InventoryModel>getAll(){
        return inventoryRepository.findAll();
    }

}
