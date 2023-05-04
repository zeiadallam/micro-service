package com.pick.inventoryservice.service;

import com.pick.inventoryservice.dto.InventoryDto;
import com.pick.inventoryservice.dto.InventoryRequest;
import com.pick.inventoryservice.mapper.InventoryMapper;
import com.pick.inventoryservice.model.InventoryModel;
import com.pick.inventoryservice.repository.InventoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class InventoryServiceImpl implements InventoryService {
    private final InventoryRepository inventoryRepository;
    private final InventoryMapper inventoryMapper;
    @Override
    public InventoryDto addItemToInventory(InventoryRequest inventoryRequest) {
        InventoryModel inventoryModel = inventoryMapper.toModel(inventoryRequest);
        InventoryModel model = inventoryRepository.findBySkuCode(inventoryModel.getSkuCode()).orElse(null);
        if (model == null) {
            return inventoryMapper.toDto(inventoryRepository.save(inventoryModel));
        } else {
            throw new RuntimeException("SkuCode already exist");
        }
    }

    @Override
    public InventoryDto getInventoryByUUID(UUID uuid) {
        return inventoryMapper.toDto(inventoryRepository.findById(uuid).orElse(null));
    }

    @Override
    public List<InventoryDto> getInventories() {
        return inventoryMapper.toDto(inventoryRepository.findAll());
    }
@Override
    public List<InventoryDto> isProductInStock(List<String> skuCodes) {
        return inventoryRepository.findBySkuCodeIn(skuCodes).stream().map(inventoryModel ->
                        InventoryDto
                                .builder()
                                .isInStock(inventoryModel.getQuantity() > 0)
                                .skuCode(inventoryModel.getSkuCode())
                                .build()).
                collect(Collectors.toList());
    }
}
