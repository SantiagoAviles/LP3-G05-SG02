public class App {
    public static void main(String[] args) throws Exception {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character[] charArray = { 'H', 'O', 'L', 'A' };

        Float[] floatArray = { 1.1f, 2.2f, 3.3f};
        Boolean[] booleanArray = { true, false };
        Persona persona1 = new Persona(123456, "John Doe", "123 Main St");
        Persona persona2 = new Persona(789012, "Jane Smith", "456 Oak St");
        Persona persona3 = new Persona(321654, "Bob Johnson", "789 Pine St");
        Persona[] personaArray = { persona1, persona2, persona3 };

        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);

        System.out.printf("%nArray floatArray contiene:%n");
        imprimirArray(floatArray);
        System.out.printf("%nArray booleanArray contiene:%n");
        imprimirArray(booleanArray);
        System.out.printf("%nArray personaArray contiene:%n");
        imprimirArray(personaArray);
    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray)
            System.out.printf("%s ", elemento);
        System.out.println();
    }
}

