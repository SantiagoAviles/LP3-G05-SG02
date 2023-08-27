import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        /*Perro fi = new Perro("Chihuahua","Marron",36,4,4);
        Perro pe = new Perro("Pekines","Negro",38,3,9);

        System.out.println(fi);
        System.out.println(pe);

        fi.increEdad(2);
        pe.increEdad(5);

        System.out.println(fi);
        System.out.println(pe);

        Diagnostico d1 = new Diagnostico();

        d1.aptoVacunaA(fi);
        d1.aptoVacunaB(pe.getTemp(),pe.getEdad(),pe.peso); */

        Scanner input = new Scanner(System.in);

        System.out.println("Datos del perro: ");

        System.out.println("Ingrese la raza del perro: ");
        String raza = input.next();
        System.out.println("Ingrese el color del perro: ");
        String color = input.next();
        System.out.println("Ingrese la temperatura del perro: ");
        double temp = input.nextDouble();
        System.out.println("Ingrese la edad del perro: ");
        int edad = input.nextInt();
        System.out.println("Ingrese el peso del perro: ");
        double peso = input.nextDouble();

        Perro can = new Perro(raza,color,temp,edad,peso);

        Diagnostico d1 = new Diagnostico();

        d1.aptoVacunaA(can);
    }
}
