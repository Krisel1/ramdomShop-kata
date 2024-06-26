package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagicCardTest {
    @Test
    void calculate_Age_For_MagicCards_Blue() {

        MagicCard magicCard = new MagicCard("Magic: The Gathering", 10, "blue");

        assertEquals(magicCard.calculatePrice(), 2.5);

    }

    @Test
    void calculate_Age_For_MagicCards_Red() {

        MagicCard magicCard = new MagicCard("Magic: The Gathering", 10, "red");

        assertEquals(magicCard.calculatePrice(), 1.75);

    }

    @Test
    void calculate_Age_For_MagicCards_Green() {

        MagicCard magicCard = new MagicCard("Magic: The Gathering", 20, "green");

        assertEquals(magicCard.calculatePrice(), 5.28);

    }

    @Test
    void calculate_Age_For_MagicCards_Black() {

        MagicCard magicCard = new MagicCard("Magic: The Gathering", 20, "black");

        assertEquals(magicCard.calculatePrice(), 8.16);

    }

    @Test
    void calculate_Price_For_MagicCards_blue() {

        MagicCard magicCard = new MagicCard("Magic: The Gathering", null, "blue");

        assertEquals(magicCard.calculatePrice(), 5.0);

    }

    @Test
    void calculate_Price_For_Magic_Cards_Red() {

        MagicCard magicCard = new MagicCard("Magic: The Gathering", null, "red");

        assertEquals(magicCard.calculatePrice(), 3.5);
    }

    @Test
    void calculate_Price_For_Magic_Cards_Green() {

        MagicCard magicCard = new MagicCard("Magic: The Gathering", null, "green");

        assertEquals(magicCard.calculatePrice(), 4.40);

    }

    @Test
    void calculate_Price_For_Magic_Cards_Black() {

        MagicCard magicCard = new MagicCard("Magic: The Gathering", null, "black");

        assertEquals(magicCard.calculatePrice(), 6.80);

    }

    @Test
    void calculate_Price_For_MagicCards_Brown() {

        MagicCard magicCard = new MagicCard("Magic: The Gathering", null, "brown");

        assertEquals(magicCard.calculatePrice(), 2.0);

    }

    @Test
    void calculate_Price_For_MagicCards_blackLotus() {
        MagicCard magicCard = new MagicCard("Magic: The Gathering - Black Lotus", null, null);

        assertEquals(magicCard.calculatePrice(), 40000.0);

    }

}
