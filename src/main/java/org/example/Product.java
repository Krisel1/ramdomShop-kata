package org.example;

import java.math.BigDecimal;

public class Product {

    private final BigDecimal sellPrice;
    private final BigDecimal basePrice;

    public Product(BigDecimal sellPrice, BigDecimal basePrice) {
        this.sellPrice = sellPrice;
        this.basePrice = basePrice;
    }

    public BigDecimal getSellPrice() {

        return sellPrice;
    }

    public BigDecimal getBasePrice(){
        return getBasePrice();
    }


}



