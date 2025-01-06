class PoligonoRegular extends Forma {
    private int numeroLados;
    private double longitudLado;

    public PoligonoRegular(int numeroLados, double longitudLado) {
        if (numeroLados < 3 || numeroLados > 12) {
            throw new IllegalArgumentException("El número de lados debe estar entre 3 y 12.");
        }
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
    }

    @Override
    public double calcularArea() {
        double perimetro = numeroLados * longitudLado;
        double apotema = longitudLado / (2 * Math.tan(Math.PI / numeroLados));
        return (perimetro * apotema) / 2;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Polígono Regular: Lados = " + numeroLados + ", Longitud del lado = " + longitudLado +
                ", Área = " + calcularArea());
    }
}