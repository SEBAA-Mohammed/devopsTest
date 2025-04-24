package org.est.devops.ms.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PorteMonnaieTest {
    @Test
    void testAjoutEtTotal() {
        PorteMonnaie pm = new PorteMonnaie();
        pm.ajouterSomme(new SommeArgent(10, "EUR"));
        pm.ajouterSomme(new SommeArgent(15, "EUR"));
        pm.ajouterSomme(new SommeArgent(5, "USD"));
        assertEquals(25, pm.montantTotalPourDevise("EUR"));
        assertEquals(5, pm.montantTotalPourDevise("USD"));
        assertEquals(0, pm.montantTotalPourDevise("GBP"));
    }
}
