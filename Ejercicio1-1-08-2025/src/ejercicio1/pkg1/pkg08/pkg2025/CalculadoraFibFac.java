package ejercicio1.pkg1.pkg08.pkg2025;

/**
 *
 * @author Briller
 */
public class CalculadoraFibFac {

    // Método para calcular el n-ésimo número de Fibonacci (usando recursión)
    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El índice no puede ser negativo");
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Método para calcular el factorial de un número (usando recursión)
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
