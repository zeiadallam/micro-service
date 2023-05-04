package com.pick.inventoryservice.mapper;

import com.pick.inventoryservice.dto.InventoryDto;
import com.pick.inventoryservice.dto.InventoryRequest;
import com.pick.inventoryservice.model.InventoryModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InventoryMapper {
    InventoryModel toModel(InventoryRequest inventoryRequest);

    @Mapping(target = "isInStock", source = "quantity", qualifiedByName = "isInStock")
    InventoryDto toDto(InventoryModel inventoryModel);

    List<InventoryDto> toDto(List<InventoryModel> inventoryModel);

    @Named("isInStock")
    default boolean isInStock(int quantity) {
        return quantity > 0;


    }


}
