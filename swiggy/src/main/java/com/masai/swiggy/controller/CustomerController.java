package com.masai.swiggy.controller;

import com.masai.swiggy.model.Customer;
import com.masai.swiggy.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
   public CustomerService customerService;

    @PostMapping("/create")
    public ResponseEntity<Customer> createCustomer(@RequestBody  Customer customer){
        Customer customer1 =customerService.createCustomer(customer);
        return new ResponseEntity<>(customer1, HttpStatus.CREATED);


    }



}
