package com.github.youssfbr.card.repositories;

import com.github.youssfbr.card.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodRepository extends JpaRepository<Food, Long> {
}
