package com.pick.inventoryservice.controller;

import com.pick.inventoryservice.dto.InventoryRequest;
import com.pick.inventoryservice.service.InventoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/inventory")
@AllArgsConstructor
@RestController
public class InventoryController {

    private final InventoryService inventoryService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity addToInventory(@RequestBody InventoryRequest inventoryRequest) {

        return ResponseEntity.ok().body(inventoryService.addItemToInventory(inventoryRequest));
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity getAll() {
        return ResponseEntity.ok().body(inventoryService.getInventories());
    }

    @GetMapping("/product-availability")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity isProductInStock(@RequestParam List<String> skuCode) {
        return ResponseEntity.ok().body(inventoryService.isProductInStock(skuCode));
    }

}





