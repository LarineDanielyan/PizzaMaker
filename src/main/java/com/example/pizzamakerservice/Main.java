package com.example.pizzamakerservice;

import com.example.pizzamakerservice.repository.OrderRepository;
import com.example.pizzamakerservice.service.OrderService;
import com.example.pizzamakerservice.service.impl.OrderServiceImpl;
import com.example.pizzamakerservice.util.SQLConnector;
import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        OrderRepository orderRepository = new OrderRepository();
        Gson gson = new Gson();
        System.out.println(gson.toJson(orderRepository.readAll()));

    }


}

