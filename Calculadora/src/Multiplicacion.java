public class Multiplicacion implements Operacion {
    private final double a, b;

    // Constructor para inicializar los valores de 'a' y 'b'
    public Multiplicacion(double[] valores) {
        this.a = valores[0];
        this.b = valores[1];
    }
    @Override
    public double calcular() { return a * b; }
}