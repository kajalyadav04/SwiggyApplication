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
public class DeliveryPartner {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer deliveryId;
//    private String deliverName;
//    private String address;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String phone;
    private String vehicleDetails;

    @OneToMany(mappedBy = "deliveryPartner", cascade = CascadeType.ALL)
    private List<Orders> orders;


}
