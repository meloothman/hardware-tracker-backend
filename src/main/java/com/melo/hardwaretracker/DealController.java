
package com.melo.hardwaretracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/deals")
public class DealController {

    @Autowired
    private DealService dealService; // Wir injizieren jetzt den Service, nicht mehr das Repo

    @GetMapping
    public Iterable<Deal> getAllDeals() {
        return dealService.getAllDeals();
    }

    @PostMapping
    public Deal createDeal(@RequestBody Deal deal) {
        return dealService.save(deal);
    }

    @DeleteMapping("/{id}")
    public void deleteDeal(@PathVariable Long id) {
        dealService.deleteById(id);
    }
}