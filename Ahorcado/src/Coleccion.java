public class Coleccion {
    private int longitud;
    private String Palabra;
    private int CantidadIntentos;

    public Coleccion(String palabra) {
        this.Palabra = palabra;
    }

    public Coleccion(int longitud, String palabra, int cantidadIntentos) {
        this.longitud = longitud;
        this.Palabra = palabra;
        this.CantidadIntentos = cantidadIntentos;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getPalabra() {
        return Palabra;
    }

    public void setPalabra(String palabra) {
        Palabra = palabra;
    }

    public int getCantidadIntentos() {
        return CantidadIntentos;
    }

    public void setCantidadIntentos(int cantidadIntentos) {
        CantidadIntentos = cantidadIntentos;
    }

    @Override
    public String toString() {
        return "Coleccion{" +
                "longitud=" + longitud +
                ", Palabra='" + Palabra + '\'' +
                ", CantidadIntentos=" + CantidadIntentos +
                '}';
    }
}
