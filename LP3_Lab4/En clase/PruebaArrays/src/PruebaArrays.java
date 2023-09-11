import java.util.ArrayList;
import java.util.Arrays;

public class PruebaArrays {
    public static void main(String[] args){

        int array1[] = {1, 2, 3, 4, 5};

        int array2[] = {10, 20, 30, 40, 50};

        for (int i = 0; i < array1.length; i++){
            System.out.println("Valor: " + array1[i]);
        }

        for (int pivot : array2){
            System.out.println("Valor: " + pivot);
        }

        int arrayMulti[][] = {{1,2,3},{44},{555,666}};

        for (int fila = 0; fila < arrayMulti.length; fila++){
            for (int columna = 0; columna < arrayMulti[fila].length; columna++){
                System.out.printf("Valor: %d ", arrayMulti[fila][columna] );
            }
            System.out.println();
        }

        int array3[] = {10, 65, 556, 7, 40, 52, 456};
        Arrays.sort(array3);
        for (int pivot : array3){
            System.out.println("Valor: " + pivot);
        }

        int posicion = Arrays.binarySearch(array3,52);
        System.out.println("Posición: " + posicion);

        int array4[] = {10, 65, 556, 7, 40, 52, 456};
        boolean respuesta = Arrays.equals(array3, array4);
        System.out.println("Respuesta: " + respuesta);

        int array5[] = new int[5];
        Arrays.fill(array5,567);
        for (int pivot : array5){
            System.out.println("Valor: " + pivot);
        }

        int array6[] = new int[7];
        System.arraycopy(array4,0,array6,0,7);
        for (int pivot : array6){
            System.out.println("Valor: " + pivot);
        }

        ArrayList<Integer> arrayDinamico = new ArrayList<Integer>();

        arrayDinamico.add(200);
        arrayDinamico.add(300);
        arrayDinamico.add(400);
        arrayDinamico.add(500);
        for (Integer pivot : arrayDinamico){
            System.out.println(pivot);
        }

        /*
        arrayDinamico.clear();
        for (Integer pivot : arrayDinamico){
            System.out.println(pivot);
        }
        */

        respuesta = arrayDinamico.contains(400);
        System.out.println("Respuesta: " + respuesta);

        System.out.println("Elemento con índice 3 es: " + arrayDinamico.get(3));

        arrayDinamico.add(400);
        arrayDinamico.add(500);
        System.out.println("Índice de la primera ocurrencia de 400 es: " + arrayDinamico.indexOf(400));

        /*
        arrayDinamico.remove((Integer)300);
        for (Integer pivot : arrayDinamico){
            System.out.println(pivot);
        }
        */

        System.out.println("El tamaño de este arreglo es " + arrayDinamico.size());

        arrayDinamico.trimToSize();
    }

    public static void blanquearArreglo(int array[]){
        for (int i = 0; i < array.length; i++){
            array[i] = 0;
        }
    }    
}
