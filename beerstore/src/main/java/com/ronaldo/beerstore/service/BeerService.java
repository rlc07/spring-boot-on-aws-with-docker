package com.ronaldo.beerstore.service;

import com.ronaldo.beerstore.model.Beer;
import com.ronaldo.beerstore.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerService {

    @Autowired
    private BeerRepository repository;

    public List<Beer> findAll() {
        return repository.findAll();
    }

    public Beer save(Beer beer) {
        return repository.save(beer);
    }
}
