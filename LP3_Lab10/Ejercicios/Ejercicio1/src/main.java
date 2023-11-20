import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        String[] array = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho"};
        imprimirArray(array);
    }


    public static <E> void imprimirArray(E[] array) {
        for (E elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }


    public static void imprimirArray(String[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
    }
}
