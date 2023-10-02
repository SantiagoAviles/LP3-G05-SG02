import java.util.Scanner;

public class TestComposicion {
    private static Persona[] personas = new Persona[5];
    private static int indice = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean salir = false;
        
        while (!salir) {
            System.out.println("1. Añadir cliente");
            System.out.println("2. Retirar");
            System.out.println("3. Depositar");
            System.out.println("4. Ver información de cliente");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = input.nextInt();
            input.nextLine();
                
            switch (opcion) {
                case 1:
                    anadirCliente(input);
                    break;
                case 2:
                    retirar(input);
                    break;
                case 3:
                    depositar(input);
                    break;
                case 4:
                    datosCliente(input);
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un valor correcto.");
                    break;
            }
        }
    }

    private static void anadirCliente(Scanner input) {
        if (indice < personas.length) {
            System.out.print("Ingrese nombre del cliente: ");
            String nombre = input.nextLine();
            System.out.print("Ingrese apellido del cliente: ");
            String apellido = input.nextLine();
            System.out.print("Ingrese tipo de cliente (C/B/E): ");
            char tipoCliente = input.nextLine().charAt(0);
            if (tipoCliente == ' '){
                Persona persona = new Persona(nombre, apellido);
                personas[indice] = persona;
                indice++;
            } else{
                Persona persona = new Persona(nombre, apellido, tipoCliente);
                personas[indice] = persona;
                indice++;
            }
            

            System.out.println("Cliente añadido.");
        } else {
            System.out.println("El array está lleno.");
        }
    }

    private static void retirar(Scanner scanner) {
        System.out.print("Ingrese nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido del cliente: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese monto a retirar: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        Persona cliente = buscarCliente(nombre, apellido);

        if (cliente != null) {
            cliente.getCuenta().retirar(valor);
        } else {
            System.out.println("Cliente no encontrado");
        }
    }

    private static void depositar(Scanner scanner) {
        System.out.print("Ingrese nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido del cliente: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese monto a depositar: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        Persona cliente = buscarCliente(nombre, apellido);

        if (cliente != null) {
            cliente.getCuenta().depositar(valor);
        } else {
            System.out.println("Cliente no encontrado");
        }
    }

    private static void datosCliente(Scanner scanner) {
        System.out.print("Ingrese nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido del cliente: ");
        String apellido = scanner.nextLine();

        Persona cliente = buscarCliente(nombre, apellido);

        if (cliente != null) {
            System.out.println(cliente.toString());
        } else {
            System.out.println("Cliente no encontrado");
        }
    }

    private static Persona buscarCliente(String nombre, String apellido) {
        for (Persona persona : personas) {
            if (persona != null && persona.getNombre().equals(nombre) && persona.getApellido().equals(apellido)) {
                return persona;
            }
        }
        return null;
    }
}



