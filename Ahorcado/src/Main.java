import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear la colección de palabras
        ColeccionPalabras coleccion = new ColeccionPalabras();

        // Crear el juego Ahorcado
        Ahorcado ahorcado = new Ahorcado(coleccion);

        // Pedir al usuario una longitud para elegir una palabra
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al juego Ahorcado");
        System.out.println("Ingrese la longitud de la palabra que desea jugar:");
        System.out.println("Asegurese que sea un número mayor a 3 y menor a 10.");

        int longitud = 0;
        boolean longitudValida = false;

        // Validar entrada de longitud
        while (true) {
            try {


                longitud = Integer.parseInt(scanner.nextLine());
                if (longitud < 3 || longitud > 10) {
                    System.out.println("Por favor, ingrese un número mayor a 3 y menor a 10.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
            }
        }

        if (ahorcado.PalabraElegida(longitud)) {
            while (ahorcado.getIntentosRestantes() > 0) {
                ahorcado.elegirLetra();

                if (ahorcado.haGanado()) {
                    System.out.println("¡Felicidades! Has descubierto la palabra: " + ahorcado.progreso());
                    break;
                }
            }

            if (!ahorcado.haGanado()) {
                System.out.println("Te has quedado sin intentos. ¡Mejor suerte la próxima vez!");
                ahorcado.mostrarPalabra();
            }
        }
    }
}
