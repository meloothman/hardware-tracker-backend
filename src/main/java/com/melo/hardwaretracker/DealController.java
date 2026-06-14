package com.melo.hardwaretracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class DealController {

    @Autowired
    DealService service;

    @PostMapping("/deals")
    public Deal createDeal(@RequestBody Deal deal) {
        return service.save(deal);
    }

    @GetMapping("/deals")
    public Iterable<Deal> getDeals() {
        return service.getAllDeals();
    }
}