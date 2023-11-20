import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        System.out.println("Antes del intercambio: " + Arrays.toString(array));
        intercambiar(array, 1, 3);
        System.out.println("Después del intercambio: " + Arrays.toString(array));
    }


    public static <T> void intercambiar(T[] array, int pos1, int pos2) {
        T temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }
}
