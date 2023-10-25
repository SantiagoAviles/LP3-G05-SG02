import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static int cociente(int numerador, int demonimador) throws ArithmeticException{
        return numerador / demonimador;
    }
    public static void main(String[] args) {
        Scanner explorador = new Scanner(System.in);
        boolean flag = true;
        do{
            try{
                System.out.println("Introduzca un numerador entero: ");
                int numerador = explorador.nextInt();
                System.out.println("Introduzca un denominador entero: ");
                int denominador = explorador.nextInt();

                int resultado = cociente(numerador, denominador);
                System.out.printf("\nResultado: %d / %d = %d\n" , numerador, denominador, resultado);
                flag = false;
            }
            catch (InputMismatchException inputMismatchE){
                System.out.printf("\nExcepción:  %s\n", inputMismatchE);
                explorador.nextLine();
                System.out.println("Debe introducir enteros. Intente de nuevo... \n");
            }
            catch (ArithmeticException arithmeticE){
                System.out.printf("\nExcepción:  %s\n", arithmeticE);
                explorador.nextLine();
                System.out.println("Cero es un denominador inválido. Intente de nuevo... \n");
            }

        } while(flag);
       explorador.close();
    }
}

