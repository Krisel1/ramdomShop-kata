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

    private BigDecimal calculatePrice(Product product) {
        if (product.getNumberOfLegs() != null) {
            if (product.getName() == "Spiders") {
                double basePrice = 1.2 * product.getNumberOfLegs();
                double extra = 0.0;

                if (product.getColor() == "Red") {
                    extra = 2.0;
                } else if (product.getColor() == "Gold") {
                    extra = 3.0;
                }
                if (product.isStinky()) {
                    return BigDecimal.valueOf((basePrice + extra) / 2.0);
                } else {
                    return BigDecimal.valueOf(basePrice + extra);
                }
            }

            return BigDecimal.valueOf(4.2 * product.getNumberOfLegs());
        } else if (product.getAge() != null && product.getColor() == null) {
            if (product.isStinky()) {
                return BigDecimal.valueOf(10.0 * product.getAge());
            } else {
                return BigDecimal.valueOf(20.0 * product.getAge());
            }
        } else if (product.getColor() != null && product.getBasePrice() != null) {
            return switch (product.getColor()) {
                case "blue" -> product.getBasePrice().add(BigDecimal.valueOf(0.1));
                case "gold" -> product.getBasePrice().multiply(BigDecimal.valueOf(100.0));
                default -> product.getBasePrice();

            };
        } else if (product.getName().equals("Magic: The Gathering - Black Lotus")) {
            return BigDecimal.valueOf(40000.0);
        } else if (product.getName().startsWith("Magic: The Gathering")) {
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
        return product.getSellPrice();
    }
}