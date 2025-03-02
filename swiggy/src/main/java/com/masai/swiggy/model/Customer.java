package com.masai.swiggy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
//import jakarta.persistence.criteria.Order;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//
//    private Integer customerId;
//    @NotNull(message="name can't be null")
//    private  String name;
//    @Email(message = "email must be in proper format")
//    @NotNull(message="name can't be null")
//    private  String email;
//    @JsonIgnore
//    @OneToMany(mappedBy = "customer")
//    private List<Orders> orders=new ArrayList<>();
//
//    public Customer( String name, String email, List<Orders> orders) {
//
//        this.name = name;
//        this.email = email;
//        this.orders = orders;
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Orders> orders;

}
