package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CocktailsTest {

    private Cocktails cocktail, cocktail2;

    @BeforeEach
    void BeforeEach() {
        cocktail2 = new Cocktails("Kindersekt");
        cocktail = new Cocktails("whiskey", new Liquid("Jacky", 750, 40));
    }

    @org.junit.jupiter.api.Test
    void getVolume() {
       assertEquals(750,cocktail.getVolume());
    }

    @org.junit.jupiter.api.Test
    void getAlcoholPercent() {
        assertEquals(40,cocktail.getAlcoholPercent());
    }

    @org.junit.jupiter.api.Test
    void isAlcoholic() {
        assertTrue(cocktail.isAlcoholic());
    }

    @Test
    void isNonAlcoholic() {
        cocktail2.setL( new Liquid("Sekt", 750, 0));
        assertFalse(cocktail2.isAlcoholic());
    }
    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("Cocktail called whiskey with 40.0 percent alcohol by volume", cocktail.toString());
    }
}