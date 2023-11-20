public class App {
    public static void main(String[] args) {
        Producto producto1 = new Producto(1, "Camisa", 29.99);
        Producto producto2 = new Producto(2, "Pantalón", 49.99);
        Producto producto3 = new Producto(3, "Zapatos", 79.99);
        Producto producto4 = new Producto(4, "Bolso", 39.99);
        Producto producto5 = new Producto(5, "Sombrero", 19.99);

        Persona persona1 = new Persona(12345678, "Juan Pérez", "Calle 123");
        Persona persona2 = new Persona(87654321, "María López", "Avenida 456");
        Persona persona3 = new Persona(98765432, "Carlos Gómez", "Carrera 789");
        Persona persona4 = new Persona(23456789, "Ana Rodríguez", "Calle 456");
        Persona persona5 = new Persona(34567890, "Pedro Martínez", "Avenida 789");

        Estudiante estudiante1 = new Estudiante(12345678, "Juan Pérez", "Calle 123", "Ingeniería de Sistemas");
        Estudiante estudiante2 = new Estudiante(87654321, "María López", "Avenida 456", "Medicina Humana");
        Estudiante estudiante3 = new Estudiante(98765432, "Carlos Gómez", "Carrera 789", "Derecho");
        Estudiante estudiante4 = new Estudiante(23456789, "Ana Rodríguez", "Calle 456", "Arquitectura");
        Estudiante estudiante5 = new Estudiante(34567890, "Pedro Martínez", "Avenida 789", "Administración");

        Producto[] arrayProducto = {producto1, producto2, producto3, producto4, producto5};
        Persona[] personaProducto = {persona1, persona2, persona3, persona4, persona5};
        Estudiante[] estudianteProducto = {estudiante1, estudiante2, estudiante3, estudiante4, estudiante5};

        System.out.println("Búsqueda de elemento en el array de Productos: " + buscarElemento(arrayProducto, producto3));
        System.out.println("Búsqueda de elemento en el array de Personas: " + buscarElemento(personaProducto, persona5));
        System.out.println("Búsqueda de elemento en el array de Estudiantes: " + buscarElemento(estudianteProducto, estudiante4));
    }

    public static <T> int buscarElemento(T[] arrayBase, T objeto){
        int posicion = -1;
        for (int i = 0; i < arrayBase.length; i++){
            if (arrayBase[i].equals(objeto)){
                posicion = i;
            }
        }
        return posicion;
    }
}
