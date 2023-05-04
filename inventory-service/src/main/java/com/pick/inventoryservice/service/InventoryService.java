package com.pick.inventoryservice.service;

import com.pick.inventoryservice.dto.InventoryDto;
import com.pick.inventoryservice.dto.InventoryRequest;

import java.util.List;
import java.util.UUID;

public interface InventoryService {
    InventoryDto addItemToInventory(InventoryRequest inventoryRequest);
   InventoryDto getInventoryByUUID(UUID uuid);
    List<InventoryDto> getInventories();
    List<InventoryDto> isProductInStock(List<String> skuCodes);
}
