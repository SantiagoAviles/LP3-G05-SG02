public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("John Doe", "123 Main St", "555-1234");
        Persona persona2 = new Persona("Jane Smith", "456 Elm St", "555-5678");
        Persona persona3 = new Persona("Michael Johnson", "789 Oak St", "555-9012");
        Persona persona4 = new Persona("Emily Davis", "321 Pine St", "555-3456");
        Persona persona5 = new Persona("David Wilson", "654 Cedar St", "555-7890");

        Persona[] personaArray = { persona1, persona2, persona3, persona4, persona5 };
        ArrayContenedora<Persona> contenedorPersona = new ArrayContenedora<Persona>(personaArray);

        Goodies goodies1 = new Goodies(1, "Chocolate Bar", 2.99f);
        Goodies goodies2 = new Goodies(2, "Cupcake", 1.49f);
        Goodies goodies3 = new Goodies(3, "Cookie", 0.99f);
        Goodies goodies4 = new Goodies(4, "Ice Cream", 3.99f);
        Goodies goodies5 = new Goodies(5, "Gummy Bears", 1.99f);

        Goodies[] goodiesArray = { goodies1, goodies2, goodies3, goodies4, goodies5 };
        ArrayContenedora<Goodies> contenedorGoodies = new ArrayContenedora<Goodies>(goodiesArray);

        Procedencia procedencia1 = new Procedencia("Lima", "Lima");
        Estudiante estudiante1 = new Estudiante("Juan Pérez", "Av. Principal 123", "555-1234", "Ingeniería Civil",procedencia1);
        Procedencia procedencia2 = new Procedencia("Arequipa", "Arequipa");
        Estudiante estudiante2 = new Estudiante("María Gómez", "Calle Secundaria 456", "555-5678", "Medicina",procedencia2);
        Procedencia procedencia3 = new Procedencia("Cusco", "Cusco");
        Estudiante estudiante3 = new Estudiante("Carlos Rodríguez", "Jirón Principal 789", "555-9012", "Arquitectura",procedencia3);
        Procedencia procedencia4 = new Procedencia("Trujillo", "La Libertad");
        Estudiante estudiante4 = new Estudiante("Ana López", "Avenida Central 321", "555-3456", "Derecho",procedencia4);
        Procedencia procedencia5 = new Procedencia("Chiclayo", "Lambayeque");
        Estudiante estudiante5 = new Estudiante("Pedro Ramírez", "Calle Principal 654", "555-7890", "Administración de Empresas", procedencia5);

        Estudiante[] estudianteArray = { estudiante1, estudiante2, estudiante3, estudiante4, estudiante5 };
        ArrayContenedora<Estudiante> contenedorEstudiante = new ArrayContenedora<Estudiante>(estudianteArray);

        String mensaje = contenedorPersona.contiene(persona1) ? "La persona está en el array" : "La persona NO está en el array"; 
        System.out.println(mensaje);
        mensaje = contenedorGoodies.contiene(goodies3) ? "El goodie está en el array" : "El goodie NO está en el array"; 
        System.out.println(mensaje);
        mensaje = contenedorEstudiante.contiene(estudiante2) ? "El estudiante está en el array" : "El estudiante NO está en el array"; 
        System.out.println(mensaje);
    }
}

