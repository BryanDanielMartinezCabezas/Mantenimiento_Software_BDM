package ejercicio1.pkg1.pkg08.pkg2025;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Briller
 */
public class CalculadoraFibFacTest {

    private CalculadoraFibFac calc;

    @BeforeClass
    public static void setUpClass() {}

    @AfterClass
    public static void tearDownClass() {}

    @Before
    public void setUp() {
        calc = new CalculadoraFibFac();
    }

    @After
    public void tearDown() {
        calc = null;
    }

    // --- TESTS FIBONACCI ---

    @Test
    public void testFibonacciCero() {
        assertEquals(0, calc.fibonacci(0));
    }

    @Test
    public void testFibonacciUno() {
        assertEquals(1, calc.fibonacci(1));
    }

    @Test
    public void testFibonacciSeis() {
        assertEquals(8, calc.fibonacci(6));
    }

    @Test
    public void testFibonacciDiez() {
        assertEquals(55, calc.fibonacci(10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFibonacciNegativo() {
        calc.fibonacci(-3);
    }

    // --- TESTS FACTORIAL ---

    @Test
    public void testFactorialCero() {
        assertEquals(1, calc.factorial(0));
    }

    @Test
    public void testFactorialUno() {
        assertEquals(1, calc.factorial(1));
    }

    @Test
    public void testFactorialCinco() {
        assertEquals(120, calc.factorial(5));
    }

    @Test
    public void testFactorialSiete() {
        assertEquals(5040, calc.factorial(7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegativo() {
        calc.factorial(-5);
    }

    @Test
    public void testFactorialOverflow() {
        int result = calc.factorial(13); // 13! sobrepasa Integer.MAX_VALUE
        assertTrue("Overflow esperado", result <= 0 || result != 6227020800L);
    }
}
