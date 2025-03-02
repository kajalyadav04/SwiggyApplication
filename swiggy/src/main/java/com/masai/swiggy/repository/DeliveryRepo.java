package com.masai.swiggy.repository;

import com.masai.swiggy.model.DeliveryPartner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DeliveryRepo extends JpaRepository<DeliveryPartner,Integer>, PagingAndSortingRepository<DeliveryPartner
        ,Integer> {
}
