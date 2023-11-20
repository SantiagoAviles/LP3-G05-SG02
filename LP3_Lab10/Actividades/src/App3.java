public class App3 {
    public static void main(String[] args) throws Exception {
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10 };
        Character[] charArray = { 'H', 'O', 'L', 'A', 'C', 'O', 'M', 'O', 'E', 'S', 'T', 'A', 'S' };
        Float[] floatArray = { 1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f, 10.10f};
        Boolean[] booleanArray = { true, false, true, true, false, false, false, true, true };
        Persona persona1 = new Persona(123456789, "John Doe", "123 Main St");
        Persona persona2 = new Persona(987654321, "Jane Smith", "456 Elm St");
        Persona persona3 = new Persona(456789123, "Michael Johnson", "789 Oak St");
        Persona persona4 = new Persona(321654987, "Emily Davis", "987 Pine St");
        Persona persona5 = new Persona(789123456, "David Wilson", "654 Maple St");
        Persona persona6 = new Persona(654987321, "Sarah Thompson", "321 Cedar St");
        Persona persona7 = new Persona(147258369, "Daniel Anderson", "852 Birch St");
        Persona persona8 = new Persona(369258147, "Jessica Martinez", "159 Walnut St");
        Persona persona9 = new Persona(258369147, "Andrew Taylor", "753 Spruce St");
        Persona persona10 = new Persona(852147369, "Olivia Brown", "369 Pineapple St");
        Persona[] personaArray = { persona1, persona2, persona3, persona4, persona5, persona6, persona7, persona8, persona9, persona10 };

        System.out.printf("Array integerArray con límites:%n");
        imprimirArray(intArray, 1, 8);
        System.out.printf("%nArray doubleArray con límites:%n");
        imprimirArray(doubleArray, 5, 9);
        System.out.printf("%nArray charArray con límites:%n");
        imprimirArray(charArray, 4, 7);
        System.out.printf("%nArray floatArray con límites:%n");
        imprimirArray(floatArray, 3, 7);
        System.out.printf("%nArray booleanArray con límites:%n");
        imprimirArray(booleanArray, 1, 5);
        System.out.printf("%nArray personaArray con límites:%n");
        imprimirArray(personaArray, 6, 9);

        System.out.printf("Array integerArray con límites erróneos:%n");
        imprimirArray(intArray, -9, 10);
    }

    public static <T> void imprimirArray(T[] inputArray, int limInf, int limSup) throws LimiteInvalidoExcepcion {
        if (limInf < 0 || limSup >= inputArray.length || limInf > limSup) {
            throw new LimiteInvalidoExcepcion("Limite inferior o superior inválidos");
        }
     
        for (int i = limInf; i <= limSup; i++) {
            System.out.printf("%s ", inputArray[i]);
        }
        System.out.println();
     }
}
