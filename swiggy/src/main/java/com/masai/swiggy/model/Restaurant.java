package com.masai.swiggy.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//private   Integer resturantId;
//private String resturantName;
//private String Adress;
//private List<Orders> orders;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String address;
    private String cuisineType;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private List<Orders> orders;
}
