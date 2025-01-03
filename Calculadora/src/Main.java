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
            switch (valor){
                case 1:
                    valores = solicitarValores(scanner);
                    Suma suma = new Suma(valores[0], valores[1]);
                    System.out.println("El resultado de la suma es " + suma.calcularSuma());
                    break;
                case 2:
                    valores = solicitarValores(scanner);
                    Resta resta = new Resta(valores[0], valores[1]);
                    System.out.println("El resultado de la resta es " + resta.calcularResta());
                    break;
                case 3:
                    valores = solicitarValores(scanner);
                    Multiplicacion multiplicacion = new Multiplicacion(valores[0], valores[1]);
                    System.out.println("El resultado de la multiplicacion es " + multiplicacion.calcularMultiplicacion());
                    break;
                case 4:
                    valores = solicitarValores(scanner);
                    Division division = new Division(valores[0], valores[1]);
                    System.out.println("El resultado de la division es " + division.calcularDivision());
                    break;
                case 5:
                    valores = solicitarValores(scanner);
                    Potencia potencia = new Potencia(valores[0], valores[1]);
                    System.out.println("El resultado de la Potencia es " + potencia.calcularPotencia());
                    break;
                case 6:
                    System.out.println("Ingrese el numero");
                    double c = scanner.nextDouble();
                    Raiz raiz = new Raiz(c);
                    System.out.println("El resultado de la Raiz cuadrada es " + raiz.calcularRaiz());
                    break;
                default:
                    System.out.println("El valor ingresado es incorrecto, intente denuevo");
                    continue;
            }
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