package com.sparta.orderpractice.controller;

import com.sparta.orderpractice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    // 음식을 생성한다
    @PostMapping("/foods")
    public void createFood() {

    }

    // 음식을 전체 조회한다
    @GetMapping("/foods")
    public void getFoods() {

    }


    // 음식을 상세 조회한다
    @GetMapping("/foods/{foodId}")
    public void getFoodDetail() {

    }

    // 주문을 생성한다.
    @PostMapping("/orders")
    public void createOrder() {

    }
    // 주문 상품을 모두 취소한다.
    @DeleteMapping("/orders/{orderId}")
    public void deleteOrder(){

    }

    // 주문 상품을 취소한다(부분 취소)
    @DeleteMapping("/orders/orderItems/{orderItemId}")
    public void deleteOrderItem(){

    }
}
