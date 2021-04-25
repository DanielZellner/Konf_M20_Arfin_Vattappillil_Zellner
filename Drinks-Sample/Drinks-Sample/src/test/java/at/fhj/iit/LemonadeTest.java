package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class LemonadeTest {

    private Lemonade lemonade;

    @BeforeEach
    void BeforeEach() {
        lemonade = new Lemonade("IcedTea", new Liquid("Icy", 750, 0));
    }

    @org.junit.jupiter.api.Test
    void getVolume() {
        assertEquals(750,lemonade.getVolume());
    }

    @org.junit.jupiter.api.Test
    void getAlcoholPercent() {
        assertEquals(0,lemonade.getAlcoholPercent());
    }

    @org.junit.jupiter.api.Test
    void isAlcoholic() {
        assertFalse(lemonade.isAlcoholic());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("Cocktail called IcedTea with 0.0 percent alcohol by volume", lemonade.toString());
    }
}