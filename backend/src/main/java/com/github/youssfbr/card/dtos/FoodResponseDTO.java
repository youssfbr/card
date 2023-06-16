package com.github.youssfbr.card.dtos;

import com.github.youssfbr.card.entities.Food;

import java.math.BigDecimal;

public record FoodResponseDTO(Long id, String name, String image, BigDecimal price) {

    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getName(), food.getImage(),food.getPrice());
    }



}
