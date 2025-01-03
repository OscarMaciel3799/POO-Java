public class Potencia {
    double a;
    double b;

    // Constructor para inicializar los valores de 'a' y 'b'
    public Potencia(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Metodo para realizar la suma
    public double calcularPotencia() {
        return Math.pow(a,b);
    }
}
