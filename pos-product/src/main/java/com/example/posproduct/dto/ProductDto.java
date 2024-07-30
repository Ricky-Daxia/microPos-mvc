package com.example.posproduct.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto implements Serializable {

    private long id;

    private String main_category;

    private String title;

    private double average_rating;

    private double price;

    private String parent_asin;

    private int stock;
}
