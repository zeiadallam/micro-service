package com.pick.productservice.mapper;

import com.pick.productservice.dto.ProductDto;
import com.pick.productservice.model.ProductModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductModel toModel(ProductDto productDto);

    ProductDto toDto(ProductModel productModel);

    List<ProductDto> toDto(List<ProductModel> productModel);
}
