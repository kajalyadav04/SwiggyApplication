package com.masai.swiggy.repository;

import com.masai.swiggy.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderRepo extends JpaRepository<Orders,Integer>, PagingAndSortingRepository<Orders,Integer> {

}
