public class Raiz implements Operacion {
    private final double a;

    // Constructor para inicializar el valor de 'a'
    public Raiz(double valores) {
        this.a = valores;
    }
    @Override
    public double calcular() { return Math.sqrt(a); }
}