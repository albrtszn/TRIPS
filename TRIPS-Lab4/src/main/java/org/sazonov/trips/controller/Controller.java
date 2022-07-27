package org.sazonov.trips.controller;

import lombok.AllArgsConstructor;
import org.sazonov.trips.repository.ItemRepository;
import org.sazonov.trips.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Controller {
    @Autowired
    private final ItemService ItemService;

    @GetMapping("/test")
    public String test(){
        return "Server working";
    }
}
