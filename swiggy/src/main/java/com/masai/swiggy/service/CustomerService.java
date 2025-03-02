package com.masai.swiggy.service;

import com.masai.swiggy.model.Customer;
import com.masai.swiggy.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public Customer createCustomer(Customer customer){
        return customerRepo.save(customer);
    }
    public List<Customer> getAllCustomers(){
        return customerRepo.findAll();
    }
    public String deleteCustomer(int id){
        if(customerRepo.existsById(id)){
            customerRepo.deleteById(id);
            return "customer deleted successfully";
        }
        return "customer not exist with this id: "+ id;
    }
    public Customer getCustomerById(int id){
//     Optional<Customer>  customer =customerRepo.findById(id);
//     if(customer.isEmpty()){
//         throw new RuntimeException("customer not found with this id");
//     }
//
//        return customer.get();
       Customer customer= customerRepo.findById(id).orElseThrow(()->
             new RuntimeException("customer not found with this id")
        );
       return customer;

    }

}
