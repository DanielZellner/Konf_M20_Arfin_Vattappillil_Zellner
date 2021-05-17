package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class VodkaTest {

    private Vodka vodka;

    @BeforeEach
    void BeforeEach() {
        vodka = new Vodka("absolutVodka", new Liquid("Tonny", 600, 50));
    }

    @org.junit.jupiter.api.Test
    void getVolume() {
        assertEquals(600,vodka.getVolume());
    }

    @org.junit.jupiter.api.Test
    void getAlcoholPercent() {
        assertEquals(50,vodka.getAlcoholPercent());
    }

    @org.junit.jupiter.api.Test
    void isAlcoholic() {
        assertTrue(vodka.isAlcoholic());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("Simple Drink called absolutVodka with 50.0 percent alcohol by volume", vodka.toString());
    }
}