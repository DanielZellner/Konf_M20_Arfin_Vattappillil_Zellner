package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaysTest {

    private Days day;

    @BeforeEach
    void BeforeEach() {
        day = new Days(1);
        day.getDays().add(new CashRegister("Bob"));
    }
    @Test
    void testToString() {
        assertEquals("Cashier called Bob with a total sells of 0€ ,on the 1 day.\n", day.toString());
    }
}