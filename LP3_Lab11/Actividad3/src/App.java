public class App {
    public static void main(String[] args) {
        Bag<Integer> bolsaEnteros = new Bag<>(5);
        Bag<String> bolsaStrings = new Bag<>(5);
        Bag<Persona> bolsaPersonas = new Bag<>(5);

        Persona persona1 = new Persona("Juan", "Av. Parra 123","302020");

        try {
            bolsaEnteros.add(1);
            bolsaEnteros.add(2);
            bolsaEnteros.add(3);
   
            bolsaStrings.add("Hola");
            bolsaStrings.add("Mundo");
   
            
            bolsaPersonas.add(persona1);
        } catch (IsFull e) {
            System.out.println(e.getMessage());
        }
   
        try {
            bolsaEnteros.getObjects();
            bolsaStrings.getObjects();
            bolsaPersonas.getObjects();
        } catch (IsEmpty e) {
            System.out.println(e.getMessage());
        }
   
        try {
            bolsaEnteros.remove(2);
            bolsaStrings.remove("Mundo");
            bolsaPersonas.remove(persona1);
        } catch (ObjectDoesntExist e) {
            System.out.println(e.getMessage());
        }
   
        int indice = bolsaEnteros.getIndex(1);
        System.out.println("Índice de 1 en la bolsa de enteros: " + indice);
   
        System.out.println("Enteros: " + bolsaEnteros.toString());
        System.out.println("Strings: " + bolsaStrings.toString());
        System.out.println("Personas: " + bolsaPersonas.toString());
    }
}

