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
    private String condition; // NEU
    private String link;      // NEU

    public Deal() {}

    public Deal(String name, String type, double price, String condition, String link) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.condition = condition;
        this.link = link;
    }

    // GETTER
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getType() { return type; }
    public double getPrice() { return price; }
    public String getCondition() { return condition; }
    public String getLink() { return link; }

    // SETTER (Wichtig für das JSON-Mapping!)
    public void setName(String name) { this.name = name; }
    public void setType(String type) { this.type = type; }
    public void setPrice(double price) { this.price = price; }
    public void setCondition(String condition) { this.condition = condition; }
    public void setLink(String link) { this.link = link; }
}