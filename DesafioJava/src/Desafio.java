import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombreCliente = "Tony Stark";
        String cuentaBancaria = "Cuenta Corriente";
        double saldoFinal = 1500.99;
        int opcion = 0;
        double retiro = 0;
        double deposito = 0;


        System.out.println("\nNombre del cliente: " + nombreCliente);
        System.out.println("Tipo de cuenta: " + cuentaBancaria);
        System.out.println("Saldo Disponible: " + saldoFinal);
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println("\nBienvenido al Menú del Banco Seguro");
            System.out.println("""
                    Escriba el número de operación deseada:
                    1 - Consulta de Saldo
                    2 - Retirar Dinero
                    3 - Depositar Dinero
                    9 - Salir
                    """);
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Su saldo total es de: " + saldoFinal);
                    break;
                case 2:
                    System.out.println("¿Cuál es el monto del retiro?");
                    retiro = teclado.nextDouble();
                    if (retiro > saldoFinal) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldoFinal = (saldoFinal - retiro);
                        System.out.println("Ud ha realizado un retiro de: " + retiro + " Le queda un saldo de: " + saldoFinal);
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál es el monto del despósito?");
                    deposito = teclado.nextDouble();
                    saldoFinal = (saldoFinal + deposito);
                    System.out.println("Ud ha realizado un depósito de: " + deposito + " El saldo final es de: " + saldoFinal);
                    break;
                case 9:
                    System.out.println("Muchas gracias por preferirnos.");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}