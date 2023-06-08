package com.github.youssfbr.card.services;

import com.github.youssfbr.card.dtos.FoodRequestDTO;
import com.github.youssfbr.card.dtos.FoodResponseDTO;
import com.github.youssfbr.card.entities.Food;
import com.github.youssfbr.card.repositories.IFoodRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FoodService implements IFoodService {

    private IFoodRepository foodRepository;

    public FoodService(IFoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }


    @Override
    @Transactional(readOnly = true)
    public List<FoodResponseDTO> findAll() {
        return foodRepository.findAll()
                .stream()
                .map(FoodResponseDTO::new)
                .toList();
    }

    @Override
    @Transactional
    public void insert(FoodRequestDTO data) {
        foodRepository.save(new Food(data));
    }

}
