package com.masai.swiggy.repository;

import com.masai.swiggy.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>, PagingAndSortingRepository<Customer,Integer> {

}
