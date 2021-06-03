package at.fhj.iit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashRegisterTest {
    private CashRegister seller;
    private final Liquid l = new Liquid("Wein", 0.125, 13);
    private final Liquid w = new Liquid("Whiskey", 0.125, 40);
    private final Liquid z = new Liquid("Cola", 1, 0);

    @BeforeEach
    void BeforeEach() {
        seller = new CashRegister("Jack");
        Drink a;
        seller.selling(a = new SimpleDrink("Rotwein",l));
        seller.selling(a = new SimpleDrink("Whiskey",w));
        seller.selling(a = new SimpleDrink("Cola",z));
    }
    @Test
    void getName() {
        assertEquals("Jack",seller.getName());
    }
    @Test
    void getTotalSells() {
        assertEquals(9.5, seller.getTotalSells());
    }
}