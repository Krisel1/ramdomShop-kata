package org.example;



import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TesrrestrialTest{
    @Test
    void calculate_for_pets_spiders_stinky() {

        Terrestrial terrestrial = new Terrestrial(null,8,"Spiders",true);

        assertEquals(terrestrial.calculatePrice(), 4.80);
    }

    @Test
    void calculate_for_pets_red_spiders() {

        Terrestrial terrestrial = new Terrestrial("Red",8,"Spiders",false);


        assertEquals(terrestrial.calculatePrice(), 11.60);

    }

    @Test
    void calculate_for_pets_gold_spiders()
    {
        Terrestrial terrestrial = new Terrestrial("Gold",8,"Spiders",false);

        assertEquals(terrestrial.calculatePrice(), 12.60);

    }

    @Test
    void calculate_for_pets_red_spiders_stinky() {

        Terrestrial terrestrial = new Terrestrial("Red",8,"Spiders",true);

        assertEquals(terrestrial.calculatePrice(), 5.80);

    }
    @Test
    void calculate_for_pets_gold_spiders_stinky() {

        Terrestrial terrestrial = new Terrestrial("Gold",8,"Spiders",true);

        assertEquals(terrestrial.calculatePrice(), 6.30);

    }
    @Test
    void calculate_For_Pets_Spiders() {

        Terrestrial terrestrial = new Terrestrial(null,8,"Spiders",false);

        assertEquals(terrestrial.calculatePrice(), 9.60);

    }
    @Test
    void calculate_For_Pets() {

        Terrestrial terrestrial = new Terrestrial(null,4,null,false);


        assertEquals(terrestrial.calculatePrice(), 16.80);

    }

}