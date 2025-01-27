public class Circulo extends Forma{
    private double radio;


    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Círculo: Radio = " + radio + ", Área = " + calcularArea());
    }
}
