package org.example;

import java.math.BigDecimal;

public class MagicCard {
    private final String name;
    private final Integer age;
    private final String color;


    public MagicCard(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Integer getAge() {
        return age;
    }

    public double calculatePrice() {
        if (this.getName().equals("Magic: The Gathering - Black Lotus")) {
            return 40000.0;
        } else if (this.getName().startsWith("Magic: The Gathering")) {
            return switch (this.getColor()) {
                case "blue" -> {
                    if (this.getAge() != null && this.getAge() >= 10) {
                        yield 5.0/2;
                    } else {
                        yield 5.0;
                    }
                }
                case "red" -> {
                    if (this.getAge() != null && this.getAge() >= 10) {
                        yield 3.5/2;
                    } else {
                        yield 3.5;
                    }
                }
                case "green" -> {
                    if (this.getAge() != null && this.getAge() >= 20) {
                        yield 4.40*1.20;
                    } else {
                        yield 4.40;
                    }
                }
                case "black" -> {
                    if (this.getAge() != null && this.getAge() >= 20) {
                        yield 6.80*1.20;
                    } else {
                        yield 6.80;
                    }
                }
                default -> 2.0;
            };
        }
        return 0;
    }
}


