import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarGeneros() {
        System.out.println("Géneros disponibles:");
        libros.stream()
                .map(Libro::getGenero)
                .distinct()
                .forEach(System.out::println);
    }

    public void mostrarLibrosPorGenero(String genero) {
        System.out.println("Libros del género \"" + genero + "\":");
        libros.stream()
                .filter(libro -> libro.getGenero().equalsIgnoreCase(genero))
                .forEach(Libro::mostrarInformacion);
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        return libros.stream()
                .filter(libro -> libro.titulo.equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }

    public void mostrarTodosLosLibros() {
        System.out.println("Listado de todos los libros:");
        libros.forEach(Libro::mostrarInformacion);
    }
}