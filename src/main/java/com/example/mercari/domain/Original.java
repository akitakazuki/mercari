package com.example.mercari.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Original {
    private Integer id;
    private String name;
    private Integer conditionId;
    private String categoryName; 
    private String brand;
    private Integer price;
    private Integer shipping;
    private String description;
}

