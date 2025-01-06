import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", "Novela"));
        biblioteca.agregarLibro(new Libro("El hobbit", "J.R.R. Tolkien", "Fantasía"));
        biblioteca.agregarLibro(new Libro("Don Quijote", "Miguel de Cervantes", "Clásico"));
        biblioteca.agregarLibro(new Libro("1984", "George Orwell", "Distopía"));

        System.out.println("¡Bienvenido a la Biblioteca!");
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Mostrar géneros literarios");
            System.out.println("2. Mostrar libros por género");
            System.out.println("3. Alquilar un libro");
            System.out.println("4. Devolver un libro");
            System.out.println("5. Mostrar todos los libros");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    biblioteca.mostrarGeneros();
                    break;

                case 2:
                    System.out.println("Ingrese el género literario:");
                    String genero = scanner.nextLine();
                    biblioteca.mostrarLibrosPorGenero(genero);
                    break;

                case 3:
                    System.out.println("Ingrese el título del libro que desea alquilar:");
                    String tituloAlquilar = scanner.nextLine();
                    Libro libroAlquilar = biblioteca.buscarLibroPorTitulo(tituloAlquilar);
                    if (libroAlquilar != null) {
                        libroAlquilar.alquilar();
                    } else {
                        System.out.println("El libro no existe en la biblioteca.");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el título del libro que desea devolver:");
                    String tituloDevolver = scanner.nextLine();
                    Libro libroDevolver = biblioteca.buscarLibroPorTitulo(tituloDevolver);
                    if (libroDevolver != null) {
                        libroDevolver.devolver();
                    } else {
                        System.out.println("El libro no existe en la biblioteca.");
                    }
                    break;

                case 5:
                    biblioteca.mostrarTodosLosLibros();
                    break;

                case 6:
                    System.out.println("¡Gracias por visitar la biblioteca!");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        }

        scanner.close();
    }
}