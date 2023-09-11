import java.util.ArrayList;
import java.util.Scanner;
public class AgendaContactos{
    public static void main(String[] args){
        ArrayList<Contacto> agenda = new ArrayList<Contacto>();
    
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);

        while (!salir){
            System.out.println("------ MENÚ ------");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Modificar contacto");
            System.out.println("4. Borrar contacto");
            System.out.println("5. Mostrar contactos");
            System.out.println("6. Eliminar todos los contactos");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el teléfono del contacto: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese la dirección del contacto: ");
                    String direccion = scanner.nextLine();
                    agregarContacto(agenda, nombre, telefono, direccion);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    String nombreBuscado = scanner.nextLine();
                    buscarContacto(agenda, nombreBuscado);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del contacto a modificar: ");
                    String nombreModificar = scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Ingrese el nuevo teléfono: ");
                    String nuevoTelefono = scanner.nextLine();
                    System.out.print("Ingrese la nueva dirección: ");
                    String nuevaDireccion = scanner.nextLine();
                    modificarContacto(agenda, nombreModificar, nuevoNombre, nuevoTelefono, nuevaDireccion);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del contacto a borrar: ");
                    String nombreBorrar = scanner.nextLine();
                    borrarContacto(agenda, nombreBorrar);
                    break;
                case 5:
                    mostrarContacto(agenda);
                    break;
                case 6:
                    eliminarContactos(agenda);
                    break;
                case 7:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
        scanner.close();
    }

    public static void agregarContacto(ArrayList<Contacto> agenda, String nombre, String telefono, String direccion){
        Contacto nuevoContacto = new Contacto(nombre, telefono, direccion);
        agenda.add(nuevoContacto);
    }

    public static void buscarContacto(ArrayList<Contacto> agenda, String nombreBuscado){
        for (Contacto contacto : agenda){
            if (contacto.getNombre().equals(nombreBuscado)){
                System.out.println(contacto.toString());
                break;
            }
        }
    }

    public static void modificarContacto(ArrayList<Contacto> agenda, String nombreBuscado, String nuevoNombre, String nuevoTelefono, String nuevaDireccion){
        for (Contacto contacto : agenda){
            if (contacto.getNombre().equals(nombreBuscado)){
                contacto.setNombre(nuevoNombre);
                contacto.setTelefono(nuevoTelefono);
                contacto.setDireccion(nuevaDireccion);
                System.out.println("¡Contacto modificado con éxito!");
                break;
            }
        }
    }

    public static void borrarContacto(ArrayList<Contacto> agenda, String nombreBuscado){
        for (Contacto contacto : agenda){
            if (contacto.getNombre().equals(nombreBuscado)){
                agenda.remove(contacto);
                System.out.println("¡Contacto eliminado con éxito!");
                break;
            }
        }
    }

    public static void mostrarContacto(ArrayList<Contacto> agenda){
        for (Contacto contacto : agenda){
            System.out.println(contacto.toString());
        }
    }

    public static void eliminarContactos(ArrayList<Contacto> agenda){
        agenda.clear();
        System.out.println("¡Agenda eliminada con éxito!");
    }
}

