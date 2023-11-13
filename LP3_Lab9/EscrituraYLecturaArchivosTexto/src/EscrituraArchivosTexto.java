import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscrituraArchivosTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter salida = null;

        try{
            salida = new PrintWriter("C:/ficheros/datos.txt");
            String cadena;
            System.out.println("Introduzca texto. Para dejar de digitar ingrese la palabra FIN: ");
            cadena = sc.nextLine();
            while (!cadena.equalsIgnoreCase("FIN")) {
                salida.println(cadena);
                cadena = sc.nextLine();
            }
            salida.flush();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } finally{
            salida.close();
        }
    }
}
