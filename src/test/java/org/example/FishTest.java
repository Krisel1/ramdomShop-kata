package org.example;


import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class FishTest{
    @Test
    void calculate_price_for_pets_blue_fist() {

        Fish fish = new Fish( "blue",0);

        assertEquals(fish.calculatePrice(),0.10);

    }

    @Test
    void calculate_price_for_pets_gold_fist() {


        Fish fish = new Fish("gold",1);

        assertEquals(fish.calculatePrice(),100.0);

    }
}

