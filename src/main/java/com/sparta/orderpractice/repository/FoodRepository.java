package com.sparta.orderpractice.repository;

import com.sparta.orderpractice.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
