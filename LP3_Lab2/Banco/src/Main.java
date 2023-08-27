import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        String titular = scanner.nextLine();

        System.out.print("Ingrese una cantidad inicial (opcional): ");
        double cantidadInicial = scanner.nextDouble();

        CuentaBanco cuenta;
        if (cantidadInicial > 0) {
            cuenta = new CuentaBanco(titular, cantidadInicial);
        } else {
            cuenta = new CuentaBanco(titular);
        }

        System.out.println("\nInformación de la cuenta:");
        System.out.println(cuenta);

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Mostrar saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a ingresar: ");
                    double cantidadIngresar = scanner.nextDouble();
                    cuenta.ingresar(cantidadIngresar);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetirar = scanner.nextDouble();
                    cuenta.retirar(cantidadRetirar);
                    break;
                case 3:
                    System.out.println("Saldo actual: " + cuenta.getCantidad());
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}