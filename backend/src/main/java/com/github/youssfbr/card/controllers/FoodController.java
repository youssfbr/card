package com.github.youssfbr.card.controllers;

import com.github.youssfbr.card.dtos.FoodRequestDTO;
import com.github.youssfbr.card.dtos.FoodResponseDTO;
import com.github.youssfbr.card.services.IFoodService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foods")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FoodController {

    private IFoodService foodService;

    public FoodController(IFoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<FoodResponseDTO> findAll() {
        return foodService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void insert(@RequestBody FoodRequestDTO data) {
        foodService.insert(data);
    }

}
