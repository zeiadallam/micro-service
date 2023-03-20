package com.pick.inventoryservice.mapper;

import com.pick.inventoryservice.dto.InventoryDto;
import com.pick.inventoryservice.model.InventoryModel;

import java.util.List;

public abstract class InventoryMapper {
    public abstract InventoryModel toModel(InventoryDto inventoryDto);
    public abstract InventoryDto toDto(InventoryModel inventoryModel);
    public abstract List<InventoryDto> toDto(List<InventoryModel> inventoryModel);
}
