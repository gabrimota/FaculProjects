public class CalculoFrete {
    public double calcularFrete(double subtotal, double distanciaKm) {
        if (subtotal >= 100) {
            return 0.00; // frete grátis
        }

        if (distanciaKm <= 3) {
            return 6.99;
        } else if (distanciaKm <= 6) {
            return 9.99;
        } else {
            return 14.99;
        }
    }
}


