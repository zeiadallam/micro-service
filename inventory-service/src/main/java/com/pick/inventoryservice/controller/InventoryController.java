package com.pick.inventoryservice.controller;

import com.pick.inventoryservice.dto.InventoryDto;
import com.pick.inventoryservice.mapper.InventoryMapper;
import com.pick.inventoryservice.model.InventoryModel;
import com.pick.inventoryservice.service.InventoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/inventory")
@AllArgsConstructor
@RestController
public class InventoryController {
    private final InventoryMapper inventoryMapper;
    private final InventoryService inventoryService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity addToInventory(@RequestBody InventoryDto inventoryDto){
        InventoryModel inventoryModel=inventoryMapper.toModel(inventoryDto);
        return ResponseEntity.ok().body(inventoryService.addToInventory(inventoryModel));
    }
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity getAll(){
        return ResponseEntity.ok().body(inventoryMapper.toDto(inventoryService.getAll()));
    }

}





