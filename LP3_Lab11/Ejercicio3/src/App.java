import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Contactos contactos = new Contactos();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Agregar contacto");
            System.out.println("2. Obtener contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Salir");
            System.out.print("Ingrese su elección: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                   System.out.print("Ingrese DNI: ");
                   String dni = scanner.nextLine();
                   System.out.print("Ingrese nombre: ");
                   String nombre = scanner.nextLine();
                   System.out.print("Ingrese número de teléfono: ");
                   String telefono = scanner.nextLine();
                   System.out.print("Ingrese correo electrónico: ");
                   String email = scanner.nextLine();
                   contactos.addContacto(dni, new Contacto(nombre, telefono, email));
                   break;
                case 2:
                   System.out.print("Ingrese DNI: ");
                   dni = scanner.nextLine();
                   try {
                       Contacto contacto = contactos.getContacto(dni);
                       System.out.println("Nombre: " + contacto.getNombre());
                       System.out.println("Número de teléfono: " + contacto.getTelefono());
                       System.out.println("Correo electrónico: " + contacto.getEmail());
                   } catch (ObjectDoesntExist e) {
                       System.out.println(e.getMessage());
                   }
                   break;
                case 3:
                   System.out.print("Ingrese DNI: ");
                   dni = scanner.nextLine();
                   if (contactos.deleteContacto(dni)) {
                       System.out.println("Contacto eliminado con éxito.");
                   } else {
                       System.out.println("Contacto no encontrado.");
                   }
                   break;
                case 4:
                   System.out.println("Saliendo...");
                   break;
                default:
                   System.out.println("Elección inválida. Por favor ingrese un número entre 1 y 4.");
            }
        } while (opcion != 4);
    }
}


