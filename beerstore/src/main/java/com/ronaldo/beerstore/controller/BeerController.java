package com.ronaldo.beerstore.controller;

import com.ronaldo.beerstore.model.Beer;
import com.ronaldo.beerstore.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/beers")
public class BeerController {

    @Autowired
    private BeerService service;

    @GetMapping
    public ResponseEntity<List<Beer>> findAll() {
        return ok(service.findAll());
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Beer create(@Valid @RequestBody Beer beer) {
        return service.save(beer);
    }
}
