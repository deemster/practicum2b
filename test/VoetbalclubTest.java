import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    @Test
    void testClubNaam() {
        Voetbalclub club1 = new Voetbalclub("Club test");
        assertEquals("Club test", club1.getNaam());
    }
    @Test
    void testClubNaamLeeg() {
        Voetbalclub club2 = new Voetbalclub("");
        assertEquals("FC", club2.getNaam());
    }
    @Test
    void testResultatenWin() {
        // Test controleert of resultaat wat niet tussen de opties staat de score beinvloedt
        Voetbalclub club3 = new Voetbalclub("Ajax");

        club3.verwerkResultaat('w'); // 3 punten
        club3.verwerkResultaat('w'); // 3 punten
        club3.verwerkResultaat('w'); // 3 punten
        club3.verwerkResultaat('o'); // niks gebeurd

        assertEquals(9, club3.aantalPunten());
    }

    @Test
    void testResultatenGelijk() {
        // Test controleert of resultaat wat niet tussen de opties staat de score beinvloedt
        Voetbalclub club4 = new Voetbalclub("Ajax");

        club4.verwerkResultaat('g'); // 1 punt
        club4.verwerkResultaat('g'); // 1 punt
        club4.verwerkResultaat('g'); // 1 punt
        club4.verwerkResultaat('x'); // niks gebeurd

        assertEquals(3, club4.aantalPunten());
    }

    @Test
    void testResultatenVerloren() {
        // Test controleert of resultaat wat niet tussen de opties staat de score beinvloedt
        Voetbalclub club5 = new Voetbalclub("Ajax");

        club5.verwerkResultaat('v'); // 0 punten
        club5.verwerkResultaat('v'); // 0 punten
        club5.verwerkResultaat('v'); // 0 punten
        club5.verwerkResultaat('x'); // niks gebeurd

        assertEquals(0, club5.aantalPunten());
    }

    @Test
    void testHerhaalPunten() {
        Voetbalclub club6 = new Voetbalclub("Ajax");

        club6.verwerkResultaat('w'); // 3 punten
        club6.verwerkResultaat('w'); // 3 punten
        club6.verwerkResultaat('g'); // 1 punt
        club6.verwerkResultaat('g'); // 1 punt
        club6.verwerkResultaat('g'); // 1 punt
        club6.verwerkResultaat('g'); // 1 punt
        club6.verwerkResultaat('v'); // 0 punten
        club6.verwerkResultaat('v'); // 0 punten
        club6.verwerkResultaat('u'); // niks gebeurd

        assertEquals(10, club6.aantalPunten());

    }

    @Test
    void testHerhaalWedstrijden() {
        // Test controleert of het herhaadelijk verwerken goed gaat en of een niet bestaand resultaat het aantal beinvloedt
        Voetbalclub club6 = new Voetbalclub("Ajax");

        club6.verwerkResultaat('w'); // 3 punten
        club6.verwerkResultaat('w'); // 3 punten
        club6.verwerkResultaat('g'); // 1 punt
        club6.verwerkResultaat('g'); // 1 punt
        club6.verwerkResultaat('g'); // 1 punt
        club6.verwerkResultaat('g'); // 1 punt
        club6.verwerkResultaat('v'); // 0 punten
        club6.verwerkResultaat('v'); // 0 punten
        club6.verwerkResultaat('u'); // niks gebeurd

        assertEquals(8, club6.aantalGespeeld());

    }

}