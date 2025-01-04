import java.util.ArrayList;

public class ColeccionPalabras {
    // Lista de palabras en la colección
    private ArrayList<Coleccion> palabras;
    // Array de palabras predefinidas
    private String[] palabrasPredefinidas = {
            "ALGORITMO", "ANGULAR", "API", "BACKEND", "BIBLIOTECA", "BYTECODE", "CLASE", "COMPILADOR",
            "CONSULTAS", "CSS", "DEPURADOR", "DOCKER", "FRAMEWORK", "FRONTEND", "FULLSTACK", "FUNCIÓN", "GIT",
            "HASHING", "HERENCIA", "HTML", "INDEXACIÓN", "INTÉRPRETE", "JAVA", "JAVASCRIPT", "KOTLIN", "MÉTODO",
            "MIDDLEWARE", "MONGODB", "MYSQL", "NODEJS", "NOSQL", "OBJETO", "PHP", "POSTGRESQL", "PYTHON", "REACT",
            "RECURSIÓN", "RUBY", "SQL", "SWIFT", "THREAD", "VARIABLE", "WEBSOCKET", "AHORCADO", "CODIGO"
    };

    // Constructor
    public ColeccionPalabras() {
        palabras = new ArrayList<>(); // Inicializar la lista
        agregarPalabrasPredefinidas(); // Agregar palabras predefinidas a la lista
    }
    // Metodo para agregar las palabras predefinidas a la colección
    private void agregarPalabrasPredefinidas() {
        for (String palabra : palabrasPredefinidas) {
            int longitud = palabra.length();
            int cantidadIntentos = (int) Math.ceil(longitud * 0.8); // Calcula los intentos
            Coleccion nuevaPalabra = new Coleccion(longitud,palabra, cantidadIntentos);
            palabras.add(nuevaPalabra);
        }
    }

    // Metodo para mostrar todas las palabras de la colección
    public void mostrarPalabras() {
        for (Coleccion palabra : palabras) {
            System.out.println(palabra);
        }
    }

    public ArrayList<Coleccion> getPalabras() {
        return palabras;
    }

    public void setPalabras(ArrayList<Coleccion> palabras) {
        this.palabras = palabras;
    }

    public String[] getPalabrasPredefinidas() {
        return palabrasPredefinidas;
    }

    public void setPalabrasPredefinidas(String[] palabrasPredefinidas) {
        this.palabrasPredefinidas = palabrasPredefinidas;
    }
}
