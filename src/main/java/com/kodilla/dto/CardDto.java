package com.kodilla.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CardDto {
    private UserDto user;
    private List<ProductDto> shoppingCart = new ArrayList<>();
}
