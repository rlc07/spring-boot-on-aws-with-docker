package com.ronaldo.beerstore.repository;

import com.ronaldo.beerstore.model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerRepository extends JpaRepository<Beer, Long> {
}
