package com.example.tip.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Product {

    @Id
    private String id;

    private Integer buyQuantity;
    private String ownerUsername;
    private String name;
    private Integer stock;
    private String description;
    private Integer price;
    private String imgSrc;
    private Category category;
    private List<String> caracteristica;

}
