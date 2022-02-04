package com.example.pizzamakerservice.model;

import lombok.*;

import java.util.Objects;
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ProductType extends Ingredient {
    private int id;
    private String name;
    private String img;
}
