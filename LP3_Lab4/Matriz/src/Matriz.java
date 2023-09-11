import java.util.Scanner;
public class Matriz {
    public static void main(String[] args){
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        //Matriz cuadrada de 4x4
        int matriz[][] = new int[4][4];
        //Variables utilizadas
        boolean salir = false;
        int opcion, fila, columna;
        //Utilizado para indicar si hemos entrado en la 1ra opcion
        boolean rellenado = false;
        //Menu
        do {
            //Mensajes del menu
            System.out.println("Menu");
            System.out.println("1. Rellenar Matriz");
            System.out.println("2. Sumar fila");
            System.out.println("3. Sumar columna");
            System.out.println("4. Sumar diagonal principal");
            System.out.println("5. Sumar diagonal inversa");
            System.out.println("6. Calcular promedio");
            System.out.println("7. Salir");
            System.out.println("Elije una opción");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    rellenarMatriz(sn, matriz);
                    //Ahora si podemos acceder al resto de opciones
                    rellenado = true;
                    break;
                case 2:
                    if (rellenado){
                    //Validamos la fila
                        do {
                            System.out.println("Elige una fila");
                            fila = sn.nextInt();
                        } while (!(fila >= 0 && fila < matriz.length));
                        System.out.println("La suma de los valores de la fila " + fila + " es: " + sumaFila(matriz, fila));
                    } else {
                        System.out.println("Debes rellenar la matriz primero...");
                    }
                    break;
                case 3:
                    if (rellenado){
                    //Validamos la columna
                        do {
                            System.out.println("Elige una columna");
                            columna = sn.nextInt();
                        } while (!(columna >= 0 && columna < matriz.length));
                        System.out.println("La suma de los valores de la columna " + columna + " es: " + sumaColumna(matriz, columna));
                    } else {
                        System.out.println("Debes rellenar la matriz primero...");
                    }
                    break;
                case 4:
                    if (rellenado){
                        System.out.println("La suma de los valores de la diagonal principal es: " + sumaDiagonalPrincipal(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero...");
                    }
                    break;
                case 5:
                    if (rellenado){
                        System.out.println("La suma de los valores de la diagonal inversa es: " + sumaDiagonalInversa(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero...");
                    }
                    break;
                case 6:
                    if (rellenado){
                        System.out.println("El promedio de los valores en la matriz es: " + calcularMedia(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero...");
                    }
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Tienes que ingresar un valor entre 1 y 7...");
            }
        } while (!salir);
        System.out.println("Fin del programa.");
    }
    /**
    * Rellena la matriz con valores insertados por el usuario
    * @param sn
    * @param matriz
    */
    public static void rellenarMatriz(Scanner sn, int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Escribe un numero en la posición: " + i + "; " + j);
                matriz[i][j] = sn.nextInt();
            }
        }
    }
    /**
    * Suma los valores de una determinada fila
    * @param matriz
    * @param fila
    * @return
    */
    public static int sumaFila(int[][] matriz, int fila){
        int suma = 0;
        for (int columna = 0; columna < matriz.length; columna++){
            suma += matriz[fila][columna];
        }
        return suma;
    }

    public static int sumaColumna(int[][] matriz, int columna){
        int suma = 0;
        for (int fila = 0; fila < matriz.length; fila++){
            suma += matriz[fila][columna];
        }
        return suma;
    }

    public static int sumaDiagonalPrincipal(int[][] matriz){
        int suma = 0;
        for (int diagonal = 0; diagonal < matriz.length; diagonal++){
            suma += matriz[diagonal][diagonal];
        }
        return suma;
    }

    public static int sumaDiagonalInversa(int[][] matriz){
        int suma = 0;
        int n = matriz.length;
        for (int diagonal = 0; diagonal < matriz.length; diagonal++){
            suma += matriz[diagonal][n - 1 - diagonal];
        }
        return suma;
    }

    public static double calcularMedia(int[][] matriz) {
        int suma = 0;
        int contador = 0;
        double media;
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                suma += matriz[fila][columna];
                contador++;
            }
        }
        media = suma / contador;
        return media;
    }
}

