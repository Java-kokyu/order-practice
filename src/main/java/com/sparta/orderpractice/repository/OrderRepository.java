package com.sparta.orderpractice.repository;

import com.sparta.orderpractice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
