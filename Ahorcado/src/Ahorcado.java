import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {
    private ColeccionPalabras coleccionPalabras;
    private Coleccion palabraSeleccionada;
    private int intentosRestantes;
    private char[] progresoActual; // Estado actual de la palabra
    private ArrayList<Character> letrasIntentadas; // Letras ya ingresadas
    Scanner scanner= new Scanner(System.in);

    // Constructor
    public Ahorcado(ColeccionPalabras coleccionPalabras) {
        this.coleccionPalabras = coleccionPalabras;
        this.letrasIntentadas = new ArrayList<>();
    }

    // Metodo para elegir una palabra según la longitud
    public boolean PalabraElegida(int longitud) {
        ArrayList<Coleccion> palabrasFiltradas = new ArrayList<>();
        for (Coleccion palabra : coleccionPalabras.getPalabras()) {
            if (palabra.getLongitud() == longitud) {
                palabrasFiltradas.add(palabra);
            }
        }

        if (palabrasFiltradas.isEmpty()) {
            System.out.println("No hay palabras con la longitud especificada.");
            return false;
        }

        // Seleccionar una palabra al azar del conjunto filtrado
        int index = (int) (Math.random() * palabrasFiltradas.size());
        palabraSeleccionada = palabrasFiltradas.get(index);
        intentosRestantes = palabraSeleccionada.getCantidadIntentos();
        progresoActual = new char[palabraSeleccionada.getLongitud()];

        // Inicializar el progreso con guiones bajos
        Arrays.fill(progresoActual, '_');
        System.out.println("¡Palabra seleccionada! Tienes " + intentosRestantes + " intentos.");
        return true;
    }

    // Metodo para obtener los intentos restantes
    public int getIntentosRestantes() {
        return intentosRestantes;
    }

    // Metodo para mostrar la palabra seleccionada
    public void mostrarPalabra() {
        if (palabraSeleccionada != null) {
            System.out.println("Palabra seleccionada: " + palabraSeleccionada.getPalabra());
        } else {
            System.out.println("No hay ninguna palabra seleccionada.");
        }
    }
    public void elegirLetra(){
        System.out.println("Ingrese una letra por favor");
        char letra = scanner.next().toUpperCase().charAt(0);
        if (letrasIntentadas.contains(letra)) {
            System.out.println("Ya intentaste esta letra. Intenta con otra.");
        } else {
            letrasIntentadas.add(letra);
            boolean encontrada = buscarLetra(letra);

            if (encontrada) {
                System.out.println("¡Correcto! La letra está en la palabra.");
            } else {
                intentosRestantes--;
                System.out.println("La letra no está en la palabra. Te quedan " + intentosRestantes + " intentos.");
            }

            // Mostrar el progreso actual
            System.out.println("Progreso: " + progreso());
        }
    }

    private boolean buscarLetra(char letra) {
        boolean encontrada = false;
        String palabra = palabraSeleccionada.getPalabra();

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                progresoActual[i] = letra; // Actualizar el progreso con la letra encontrada
                encontrada = true;
            }
        }
        return encontrada;
    }

    // Metodo para mostrar el progreso actual de la palabra
    public String progreso() {
        return new String(progresoActual);
    }

    // Metodo para verificar si el jugador ha ganado
    public boolean haGanado() {
        return new String(progresoActual).equals(palabraSeleccionada.getPalabra());
    }


}

