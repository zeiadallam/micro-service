package com.pick.productservice.mapper;

import com.pick.productservice.dto.ProductDto;
import com.pick.productservice.model.ProductModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class ProductMapper {
    abstract public ProductModel toModel(ProductDto productDto);
    abstract public ProductDto toDto(ProductModel productModel);
    abstract public List<ProductDto> toDto(List<ProductModel> productModel);
}
