import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer nombre: ");
        String primerNombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Ingrese el día de nacimiento: ");
        int diaNacimiento = scanner.nextInt();

        System.out.print("Ingrese el mes de nacimiento: ");
        int mesNacimiento = scanner.nextInt();

        System.out.print("Ingrese el año de nacimiento: ");
        int anioNacimiento = scanner.nextInt();

        System.out.print("Ingrese la altura en centímetros: ");
        double altura = scanner.nextDouble();

        System.out.print("Ingrese el peso en kilogramos: ");
        double peso = scanner.nextDouble();

        PerfilMedico perfil = new PerfilMedico(primerNombre, apellido, sexo, diaNacimiento, mesNacimiento,
                anioNacimiento, altura, peso);

        int anioActual = 2023; // Cambiar al año actual
        int edad = perfil.calcularEdad(anioActual);
        int fcm = perfil.calcularFrecuenciaCardiacaMaxima(edad);
        double imc = perfil.calcularIMC();

        System.out.println("\nInformación del perfil médico:");
        System.out.println("Nombre: " + perfil.getPrimerNombre() + " " + perfil.getApellido());
        System.out.println("Sexo: " + perfil.getSexo());
        System.out.println("Fecha de nacimiento: " + perfil.getDiaNacimiento() + "/" + perfil.getMesNacimiento() + "/"
                + perfil.getAnioNacimiento());
        System.out.println("Altura: " + perfil.getAltura() + " cm");
        System.out.println("Peso: " + perfil.getPeso() + " kg");

        System.out.println("\nEdad: " + edad + " años");
        System.out.println("Frecuencia Cardiaca Máxima: " + fcm + " bpm");
        System.out.println("Índice de Masa Corporal: " + imc);

        scanner.close();
    }
}