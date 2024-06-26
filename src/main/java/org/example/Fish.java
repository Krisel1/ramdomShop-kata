package org.example;


import java.math.BigDecimal;

public class Fish {

    private final String color;
    private final double basePrice;


    public Fish(String color, double basePrice) {
        this.color = color;
        this.basePrice = basePrice;

    }

    public String getColor() {
        return color;
    }

    public double getBasePrice() {
        return basePrice;
    }


    public double calculatePrice() {
        return switch (this.getColor()) {
            case "blue" -> this.getBasePrice() + 0.10;
            case "gold" -> this.getBasePrice() * 100.0;
            default -> this.getBasePrice();

        };
    }
}
