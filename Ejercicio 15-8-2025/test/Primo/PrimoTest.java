package Primo;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimoTest {

    @Test
    public void testNumeroPrimo() {
        Primo p = new Primo();
        boolean resultado = p.esPrimo(7);
        assertTrue(resultado); 
    }

    @Test
    public void testNumeroNoPrimo() {
        Primo p = new Primo();
        boolean resultado = p.esPrimo(6);
        assertFalse(resultado);
    }

    @Test
    public void testNumeroNegativo() {
        Primo p = new Primo();
        boolean resultado = p.esPrimo(-3);
        assertFalse(resultado); 
    }

    @Test
    public void testNumeroGrande() {
        Primo p = new Primo();
        boolean resultado = p.esPrimo(997);
        assertTrue(resultado);
    }

    @Test
    public void testNumeroCero() {
        Primo p = new Primo();
        boolean resultado = p.esPrimo(0);
        assertFalse(resultado); 
    }
}
