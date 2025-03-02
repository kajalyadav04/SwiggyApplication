package com.masai.swiggy.repository;

import com.masai.swiggy.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestRepo extends JpaRepository<Restaurant,Integer>, PagingAndSortingRepository<Restaurant,Integer> {
}
