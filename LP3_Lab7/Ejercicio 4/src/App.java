import java.util.Scanner;

public class App {
   public static void main(String args[]) {
       Scanner scn = new Scanner(System.in);
       try {
           int n = Integer.parseInt(scn.nextLine());
           if (99 % n == 0)
               System.out.println(n + " es un factor de 99");
       } catch (NumberFormatException | ArithmeticException ex) {
           System.out.println("Se encontró una excepción: " + ex);
       }
   }
}