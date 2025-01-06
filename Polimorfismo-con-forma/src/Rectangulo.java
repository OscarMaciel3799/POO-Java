class Rectangulo extends Forma {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Rectángulo: Ancho = " + ancho + ", Alto = " + alto + ", Área = " + calcularArea());
    }
}