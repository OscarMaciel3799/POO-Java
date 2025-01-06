import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora de área de formas geométricas");
        System.out.println("Elija la opción de la figura que desea calcular:");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Polígono Regular");
        System.out.println("0. Salir");

        Forma forma;

        while (true) {
            System.out.println("Ingrese su elección:");
            int eleccion = scanner.nextInt();

            if (eleccion == 0) {
                System.out.println("Gracias por usar la calculadora. ¡Adiós!");
                break;
            }

            if (eleccion >= 1 && eleccion <= 3) {
                switch (eleccion) {
                    case 1:
                        System.out.println("Por favor, ingrese el radio del círculo:");
                        double radio = scanner.nextDouble();
                        forma = new Circulo(radio);
                        forma.mostrarInformacion();
                        break;

                    case 2:
                        System.out.println("Por favor, ingrese el ancho del rectángulo:");
                        double ancho = scanner.nextDouble();
                        System.out.println("Por favor, ingrese el alto del rectángulo:");
                        double alto = scanner.nextDouble();
                        forma = new Rectangulo(ancho, alto);
                        forma.mostrarInformacion();
                        break;

                    case 3:
                        System.out.println("Por favor, ingrese el número de lados del polígono regular (entre 3 y 12):");
                        int numeroLados = scanner.nextInt();
                        if (numeroLados < 3 || numeroLados > 12) {
                            System.out.println("El número de lados debe estar entre 3 y 12. Inténtelo de nuevo.");
                            break;
                        }
                        System.out.println("Por favor, ingrese la longitud de cada lado:");
                        double longitudLado = scanner.nextDouble();
                        forma = new PoligonoRegular(numeroLados, longitudLado);
                        forma.mostrarInformacion();
                        break;

                    default:
                        System.out.println("Opción inválida.");
                }
            } else {
                System.out.println("Por favor, asegúrese de ingresar una opción válida.");
            }
        }

        scanner.close();
    }
}
