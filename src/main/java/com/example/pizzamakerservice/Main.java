package com.example.pizzamakerservice;

import com.example.pizzamakerservice.repository.OrderRepository;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        OrderRepository orderRepository = new OrderRepository();
        Gson gson = new Gson();
        System.out.println(gson.toJson(orderRepository.readAll()));

    }


}

