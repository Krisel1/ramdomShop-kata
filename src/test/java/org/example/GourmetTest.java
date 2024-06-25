package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GourmetTest{
    @Test
    void calculate_Price_for_wine(){
        Gourmet gourmet = new Gourmet(10, false);
        assertEquals(gourmet.calculatePrice(), 200.0);
    }

    @Test
    void calculate_price_for_cheese() {

        Gourmet gourmet = new Gourmet(10, true);

        assertEquals(gourmet.calculatePrice(), 100.0);

    }

}
