package org.example;

import java.math.BigDecimal;

public class Product {


    private final BigDecimal basePrice;

    private final BigDecimal sellPrice;

    public Product(Integer age, String color, BigDecimal basePrice, String name, BigDecimal sellPrice) {

        this.basePrice = basePrice;
        this.sellPrice = sellPrice;
    }




    public BigDecimal getBasePrice() {
        return basePrice;
    }





    public BigDecimal getSellPrice() {
        return sellPrice;
    }

}
