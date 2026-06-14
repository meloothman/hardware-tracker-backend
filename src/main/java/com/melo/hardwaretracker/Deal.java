package com.melo.hardwaretracker;

import jakarta.persistence.*;

@Entity
public class Deal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private double price;

    public Deal() {} // Wichtig für Hibernate

    public Deal(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getType() { return type; }
    public double getPrice() { return price; }
}