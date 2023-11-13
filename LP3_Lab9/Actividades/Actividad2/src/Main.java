import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);    
        String cadena;

        try (PrintWriter salida = new PrintWriter("C:/ficheros/datos.txt")){
            System.out.println("Introduzca texto. Para finalizar introduzca la cadena FIN: ");
            cadena = sc.nextLine();
            while (!cadena.equalsIgnoreCase("FIN")){
                salida.println(cadena);
                cadena = sc.nextLine();
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
