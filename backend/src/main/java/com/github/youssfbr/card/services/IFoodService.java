package com.github.youssfbr.card.services;

import com.github.youssfbr.card.dtos.FoodRequestDTO;
import com.github.youssfbr.card.dtos.FoodResponseDTO;

import java.util.List;

public interface IFoodService {

    List<FoodResponseDTO> findAll();
    void insert(FoodRequestDTO data);

}
