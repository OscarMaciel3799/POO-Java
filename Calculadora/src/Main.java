import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Esta es una calculadora que nos permite hacer los siguientes calculos:");

        while(true){
            System.out.println("" +
                    "1.Suma \n" +
                    "2.Resta\n" +
                    "3.Multiplicacion\n" +
                    "4.Division\n" +
                    "5.Potencia\n" +
                    "6.Raiz cuadrada");
            System.out.println("Ingrese una opcion");
            int valor=scanner.nextInt();

            double[] valores;
            double a;
            Operacion operacion;
            switch (valor){
                case 1 -> operacion = new Suma(solicitarValores(scanner));
                case 2 -> operacion = new Resta(solicitarValores(scanner));
                case 3 -> operacion = new Multiplicacion(solicitarValores(scanner));
                case 4 -> operacion = new Division(solicitarValores(scanner));
                case 5 -> operacion = new Potencia(solicitarValores(scanner));
                case 6 -> {
                    System.out.println("Ingrese el número:");
                    double numero = scanner.nextDouble();
                    operacion = new Raiz(numero);
                }
                default -> {
                    System.out.println("Opción incorrecta. Intente de nuevo.");
                    continue;
                }
            }
            System.out.println("El resultado de la operacion es: " + operacion.calcular());
            break;
        }


    }
    public static double[] solicitarValores(Scanner scanner) {
        System.out.println("Ingrese el primer valor");
        double a = scanner.nextDouble();
        System.out.println("Ingrese el segundo valor");
        double b = scanner.nextDouble();
        return new double[]{a, b};
    }

}