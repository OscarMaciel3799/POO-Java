public class Main {
    public static void main(String[] args) {
        // Crear una cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria("1234567890", "Juan Pérez", 500.00);

        // Mostrar información de la cuenta
        cuenta.mostrarInformacionCuenta();

        // Depositar dinero
        cuenta.depositar(200.00);

        // Intentar retirar más dinero del que hay en la cuenta
        cuenta.retirar(800.00);

        // Retirar una cantidad válida
        cuenta.retirar(300.00);

        // Consultar el saldo
        System.out.println("Saldo actual: " + cuenta.consultarSaldo());
    }
}
