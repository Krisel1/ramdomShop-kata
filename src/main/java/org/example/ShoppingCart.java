package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Double getTotalPrice() {
        return products.stream()
                .map(this::calculatePrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .doubleValue();
    }

    public BigDecimal calculatePrice(Product product) {
        //if (product.getNumberOfLegs() != null) {
        //    return calculatePriceByLegs(product);
        if (product.getAge() != null && product.getColor() == null) {
            return calculatePriceByAge(product);
        } else if (product.getColor() != null && product.getBasePrice() != null) {
            return calculatePriceByColorAndBasePrice(product);
        } else if (product.getName().equals("Magic: The Gathering - Black Lotus")) {
            return BigDecimal.valueOf(40000.0);
        } else if (product.getName().startsWith("Magic: The Gathering")) {
            return calculatePriceForMagicTheGathering(product);
        }
        return product.getSellPrice();
    }

    public BigDecimal calculatePriceByAge(Product product) {
        if (product.isStinky()) {
            return BigDecimal.valueOf(10.0 * product.getAge());
        } else {
            return BigDecimal.valueOf(20.0 * product.getAge());
        }
    }


    public BigDecimal calculatePriceByColorAndBasePrice(Product product) {
        return switch (product.getColor()) {
            case "blue" -> product.getBasePrice().add(BigDecimal.valueOf(0.1));
            case "gold" -> product.getBasePrice().multiply(BigDecimal.valueOf(100.0));
            default -> product.getBasePrice();
        };
    }

    public BigDecimal calculatePriceForMagicTheGathering(Product product) {
        return switch (product.getColor()) {
            case "blue" -> {
                if (product.getAge() != null && product.getAge() >= 10) {
                    yield BigDecimal.valueOf(5.0).divide(BigDecimal.valueOf(2));
                } else {
                    yield BigDecimal.valueOf(5.0);
                }
            }
            case "red" -> {
                if (product.getAge() != null && product.getAge() >= 10) {
                    yield BigDecimal.valueOf(3.5).divide(BigDecimal.valueOf(2));
                } else {
                    yield BigDecimal.valueOf(3.5);
                }
            }
            case "green" -> {
                if (product.getAge() != null && product.getAge() >= 20) {
                    yield BigDecimal.valueOf(4.40).multiply(BigDecimal.valueOf(1.20));
                } else {
                    yield BigDecimal.valueOf(4.40);
                }
            }
            case "black" -> {
                if (product.getAge() != null && product.getAge() >= 20) {
                    yield BigDecimal.valueOf(6.80).multiply(BigDecimal.valueOf(1.20));
                } else {
                    yield BigDecimal.valueOf(6.80);
                }
            }
            default -> BigDecimal.valueOf(2.0);
        };
    }
}



