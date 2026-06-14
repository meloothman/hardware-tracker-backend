package com.melo.hardwaretracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DealService {
    @Autowired
    DealRepository repo;

    public Deal save(Deal deal) {
        return repo.save(deal);
    }

    public Iterable<Deal> getAllDeals() {
        return repo.findAll();
    }

    // Neu für die Löschfunktion
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}