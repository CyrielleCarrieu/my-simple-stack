package deqo.ccar.mysimplestack;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    int valeur = 6;
    Item item = new Item(valeur);

    @Test
    public void setValeur() {
        item.setValeur(12);
        int retour = item.getValeur();
        assertEquals("Ne renvoi pas la bonne valeur",12,retour);
    }
}