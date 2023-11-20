public class App2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Mínimo de Enteros: " + minimo(11, 4, 5, 6));
        System.out.println("Mínimo de Dobles: " + minimo(8.8, 7.7, 8.8, 9.9));
        System.out.println("Mínimo de Strings: " + minimo("pera", "zanahoria", "uva", "manzana"));
        Persona persona1 = new Persona(123456, "John Doe", "123 Main St");
        Persona persona2 = new Persona(789012, "Jane Smith", "456 Oak St");
        Persona persona3 = new Persona(321654, "Bob Johnson", "789 Pine St");
        Persona persona4 = new Persona(457838, "Jonas Brother", "101112 Spruce St");
        System.out.println("Mínimo de Personas: " + minimo(persona1, persona2, persona3, persona4));
    }

    public static <T extends Comparable<T>> T minimo(T w, T x, T y, T z) {
        T min = w;
        if (x.compareTo(w) < 0)
            min = x;
        if (y.compareTo(x) < 0)
            min = y;
        if (z.compareTo(y) < 0)
            min = z;

        return min;
    }
}
