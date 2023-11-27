public class App {
    public static void main(String[] args) throws Exception {
        Integer entero1 = 1;
        Integer entero2 = 2;
        Integer entero3 = 3;
        Integer entero4 = 4;
        Integer entero5 = 5;

        String cadena1 = "Hola";
        String cadena2 = "muy";
        String cadena3 = "buenos";
        String cadena4 = "dias";
        String cadena5 = ":)";

        Persona persona1 = new Persona("John Doe", "123 Main St", "555-1234");
        Persona persona2 = new Persona("Jane Smith", "456 Elm St", "555-5678");
        Persona persona3 = new Persona("Michael Johnson", "789 Oak St", "555-9012");
        Persona persona4 = new Persona("Emily Davis", "321 Pine St", "555-3456");
        Persona persona5 = new Persona("David Wilson", "654 Cedar St", "555-7890");

        OrderedPair<Integer,Integer> par1 = new OrderedPair<Integer,Integer>(entero1, entero3);
        OrderedPair<Integer,String> par2 = new OrderedPair<Integer,String>(entero5, cadena3);
        OrderedPair<String,Persona> par3 = new OrderedPair<String,Persona>(cadena4, persona3);

        System.out.println("Método toString() del primer par ordenado: " + par1.toString());
        System.out.println("Método toString() del segundo par ordenado: " + par2.toString());
        System.out.println("Método toString() del tercer par ordenado: " + par3.toString());
    }
}

