package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    // Antiguedad cartas
    @Test
    void calculate_precio_antiguedad_for_magic_cards_red() {
        // Arrange
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Lightning Bolt", null);
        // Act
        shoppingCart.addProduct(product);
        // Assert
        assertEquals(shoppingCart.getTotalPrice(), 1.75);

    }

    @Test
    void calculate_Precio_antiguedad_for_magic_cards_blue() {
        // Arrange
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Lightning Bolt", null);
        // Act
        shoppingCart.addProduct(product);
        // Assert
        assertEquals(shoppingCart.getTotalPrice(),2.50);

    }

    @Test
    void calculate_for_pets_spiders() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null,false,null, null, "Spiders",null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(),9.60);

    }
    @Test
    void calculate_for_pets() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(4, null,false,null, null, null,null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(),16.80);

    }

    @Test
    void calculate_for_pets_red_spiders() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null,false,"Red",null,"Spiders",null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(),11.60);

    }

    @Test
    void calculate_for_pets_gold_spiders() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null,false,"Gold",null,"Spiders",null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(),12.60);

    }
    @Test
    void calculate_for_pets_spiders_stinky() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null,true, null, null, "Spiders",null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(),4.80);

    }
    @Test
    void calculate_for_pets_spiders_red_stinky(){
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null,true, "Red", null, "Spiders",null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(),5.80);

    }
    @Test
    void calculate_for_pets_spider_gold_stinky(){
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null,true, "Gold", null, "Spiders",null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(),6.30);

    }


    @Test
    void calculate_price_for_magic_Cards_red() {
        // Arrange
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Lightning Bolt", null);
        // Act
        shoppingCart.addProduct(product);
        // Assert
        assertEquals(shoppingCart.getTotalPrice(), 3.5);

    }

    @Test
    void calculate_price_for_magic_cards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.0);

    }

    @Test
    void calculate_price_for_magic_cards_green() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 4.40);

    }

    @Test
    void calculate_price_for_magic_cards_black() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 6.80);

    }

    // TODO cambiar lo default del código del color marron
    @Test
    void calculate_Price_For_Magic_Cards_brown() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "brown", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 2.0);

    }

    @Test
    void calculate_price_for_magic_cards_black_lotus() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "null", null, "Magic: The Gathering - Black Lotus", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 40000.0);

    }

    @Test
    void calculate_Price_for_wine(){
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, null, null, "el tio juanillo", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 100.0);

    }

    @Test
    void calculate_price_for_cheese() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, true, null, null, "French Camembert", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 50.0);

    }

    @Test
    void calculate_price_for_pets_blue_fist() {
        ShoppingCart shoppingCart = new ShoppingCart();


        Product product = new Product(null, null,false,"blue",  BigDecimal.valueOf(0),null,null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(),0.10);

    }

    @Test
    void calculate_price_for_pets_gold_fist() {
        ShoppingCart shoppingCart = new ShoppingCart();


        Product product = new Product(null, null,false,"gold",BigDecimal.valueOf(1),null,null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(),100.0);

    }
}