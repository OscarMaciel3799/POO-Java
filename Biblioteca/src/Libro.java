public class Libro {
    public String titulo;
    private String autor;
    private String genero;
    private boolean disponible;

    public Libro(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponible = true;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void alquilar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro \"" + titulo + "\" ha sido alquilado.");
        } else {
            System.out.println("Lo sentimos, el libro \"" + titulo + "\" no está disponible.");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
        } else {
            System.out.println("El libro \"" + titulo + "\" ya estaba disponible.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Género: " + genero +
                ", Disponible: " + (disponible ? "Sí" : "No"));
    }
}