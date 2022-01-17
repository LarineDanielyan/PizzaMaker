package com.example.pizzamakerservice.service;

import com.example.pizzamakerservice.model.Product;

import java.util.List;

public interface ProductService {

    Product read (int id);

    Product readByProductType (int ProductTypeId);

    List<Product> readAll();

    void create();

    Product update (int id,Product product);

    void delete (int id);
}
