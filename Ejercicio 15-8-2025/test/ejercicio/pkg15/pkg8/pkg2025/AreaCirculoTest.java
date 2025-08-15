package ejercicio.pkg15.pkg8.pkg2025;

import org.junit.Test;
import static org.junit.Assert.*;

public class AreaCirculoTest {

    @Test
    public void testRadioPositivo() {
        AreaCirculo ac = new AreaCirculo();
        double resultado = ac.calcularArea(5);
        assertEquals(78.53981633974483, resultado, 0.0001);
    }

    @Test
    public void testRadioCero() {
        AreaCirculo ac = new AreaCirculo();
        double resultado = ac.calcularArea(0);
        assertEquals(0, resultado, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
       public void testRadioNegativo() {
           AreaCirculo ac = new AreaCirculo();
           ac.calcularArea(-3); 
       }


    @Test
    public void testRadioGrande() {
        AreaCirculo ac = new AreaCirculo();
        double resultado = ac.calcularArea(1000);
        assertEquals(3_141_592.653589793, resultado, 0.0001);
    }

    @Test
    public void testRadioDecimal() {
        AreaCirculo ac = new AreaCirculo();
        double resultado = ac.calcularArea(3.5);
        assertEquals(38.48451000647496, resultado, 0.0001);
    }
}
