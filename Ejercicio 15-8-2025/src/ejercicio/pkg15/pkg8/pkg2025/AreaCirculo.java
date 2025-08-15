package ejercicio.pkg15.pkg8.pkg2025;

public class AreaCirculo {

    public double calcularArea(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }
        return Math.PI * radio * radio;
    }
}
