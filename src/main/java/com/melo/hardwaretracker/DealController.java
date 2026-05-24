package com.melo.hardwaretracker;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin(origins = "*") // Killt den CORS-Error, lässt alle Frontends zu
public class DealController {

    // Unser Datenmodell als Record (Java 17 Cheatcode, spart hunderte Zeilen Code)
    public record Deal(int id, String name, String type, double price) {}

    // Das ist die Route, die wir für M3 abgeben müssen
    @GetMapping("/deals")
    public List<Deal> getDeals() {
        return List.of(
                new Deal(1, "AMD Ryzen 5 5600X (Gebraucht)", "CPU", 110.00),
                new Deal(2, "NVIDIA RTX 3060 12GB", "GPU", 230.00),
                new Deal(3, "Kingston FURY 16GB DDR4", "RAM", 30.00)
        );
    }
}