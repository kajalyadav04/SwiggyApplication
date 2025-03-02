package com.masai.swiggy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
//    @Id
//    private Integer orderId;
//    private List<String> items;
//    private Double totalAmount;
//    @JsonIgnore
//    @ManyToOne
//    private  Customer customer;
//    @ManyToOne
//    private Restaurant resturant;
//    @ManyToOne
//    private DeliveryPartner deliveryPartner;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    @ManyToOne
    @JoinColumn(name = "delivery_partner_id")
    private DeliveryPartner deliveryPartner;

    private String status;
    private double totalAmount;
    private LocalDateTime orderTime;


}
