package org.est.devops.ms.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SommeArgentTest {
    @Test
    void testEgalite() {
        SommeArgent s1 = new SommeArgent(50, "EUR");
        SommeArgent s2 = new SommeArgent(50, "EUR");
        assertEquals(s1, s2);
    }

    @Test
    void testAdditionMemeDevise() {
        SommeArgent s1 = new SommeArgent(20, "EUR");
        SommeArgent s2 = new SommeArgent(30, "EUR");
        SommeArgent attendu = new SommeArgent(50, "EUR");
        assertEquals(attendu, s1.additionner(s2));
    }

    @Test
    void testAdditionDeviseDifferente() {
        SommeArgent s1 = new SommeArgent(10, "EUR");
        SommeArgent s2 = new SommeArgent(10, "USD");
        assertThrows(IllegalArgumentException.class, () -> {
            s1.additionner(s2);
        });
    }
}
