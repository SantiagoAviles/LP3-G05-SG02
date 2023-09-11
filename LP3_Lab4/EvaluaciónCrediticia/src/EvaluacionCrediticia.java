import java.util.Scanner;

public class EvaluacionCrediticia {
    public static void main(String[] args){
        Persona[] listaEvaluacion = new Persona[8];
        for (int i = 0; i < listaEvaluacion.length; i++) {
            listaEvaluacion[i] = new Persona(0, 0, 0);
        }
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int sexo = 0;
        int trabajo = 0;
        int sueldo = 0;
        int espacio = 0;
        int aleatorizo = 0;
        do{
            System.out.println("----------------MENÚ----------------");
            System.out.println("1) Agregar persona");
            System.out.println("2) Aleatorizar persona");
            System.out.println("3) Mostrar lista de personas");
            System.out.println("4) Calcular el porcentaje total de hombres");
            System.out.println("5) Calcular el porcentaje total de mujeres");
            System.out.println("6) Calcular el porcentaje de hombres que trabajan");
            System.out.println("7) Calcular el porcentaje de mujeres que trabajan");
            System.out.println("8) Calcular el sueldo promedio de las hombres que trabajan");
            System.out.println("9) Calcular el sueldo promedio de las mujeres que trabajan");
            System.out.println("0) Salir");
            System.out.println("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                case 1:
                    sexo = 0;
                    trabajo = 0;
                    sueldo = 0;
                    if (espacio<listaEvaluacion.length){
                        do{
                        System.out.println("Ingrese el sexo de la persona (1 si es hombre, 2 si es mujer): ");
                        sexo = scanner.nextInt();
                        } while(sexo < 1 || sexo > 2);

                        do{
                        System.out.println("Ingrese si la persona trabaja o no (1 si trabaja, 2 si no trabaja): ");
                        trabajo = scanner.nextInt();
                        } while(trabajo < 1 || trabajo > 2);

                        if (trabajo==1){
                            do{
                            System.out.println("Ingrese el sueldo de la persona (entre 900 y 3000): ");
                            sueldo = scanner.nextInt();
                            } while(sueldo < 900 || sueldo > 3000);
                        }
                        else{
                            sueldo = 0;
                        }
                        listaEvaluacion[espacio] = new Persona(sexo, trabajo, sueldo);
                        System.out.println("La persona ha sido agregada al espacio " + espacio + " satisfactoriamente.");
                        espacio++;
                    }
                    else{
                        System.out.println("El array está lleno.");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el índice de la persona a aleatorizar: ");
                    aleatorizo = scanner.nextInt();
                    Persona.aleatorizador(listaEvaluacion[aleatorizo]);
                    System.out.println("¡Aleatorización realizada con éxito! Nuevos datos de la persona: ");
                    System.out.println(listaEvaluacion[aleatorizo].toString());
                    break;
                case 3:
                    for (Persona persona : listaEvaluacion){
                        System.out.println(persona.toString()+"\n");
                    }
                    break;
                case 4:
                    System.out.println("Total porcentaje de hombres: " + porcentajeHombres(listaEvaluacion) + "%");
                    break;
                case 5:
                    System.out.println("Total porcentaje de mujeres: " + porcentajeMujeres(listaEvaluacion) + "%");
                    break;
                case 6:
                    System.out.println("Total porcentaje de hombres que trabajan: " + porcentajeHombresQueTrabajan(listaEvaluacion) + "%");
                    break;
                case 7:
                    System.out.println("Total porcentaje de mujeres que trabajan: " + porcentajeMujeresQueTrabajan(listaEvaluacion) + "%");
                    break;
                case 8:
                    System.out.println("Sueldo promedio de hombres que trabajan: S/. " + sueldoHombresQueTrabajan(listaEvaluacion));
                    break;
                case 9:
                    System.out.println("Sueldo promedio de mujeres que trabajan: S/. " + sueldoMujeresQueTrabajan(listaEvaluacion));
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

        } while(opcion != 0);
        scanner.close();
    }

    public static float porcentajeHombres(Persona[] matriz){
        int contador = 0;
        int total = matriz.length;
        float porcentaje = 0;
        for (Persona persona : matriz){
            if (persona.getSexo() == 1){
                contador++;
            }
        }
        porcentaje = (contador * 100 / total);
        return porcentaje;
    }

    public static float porcentajeMujeres(Persona[] matriz){
        int contador = 0;
        int total = matriz.length;
        float porcentaje = 0;
        for (Persona persona : matriz){
            if (persona.getSexo() == 2){
                contador++;
            }
        }
        porcentaje = (contador * 100 / total);
        return porcentaje;
    }

    public static float porcentajeHombresQueTrabajan(Persona[] matriz){
        int contador = 0;
        int total = matriz.length;
        float porcentaje = 0;
        for (Persona persona : matriz){
            if (persona.getSexo() == 1 && persona.getTrabajo() == 1){
                contador++;
            }
        }
        porcentaje = (contador * 100 / total);
        return porcentaje;
    }

    public static float porcentajeMujeresQueTrabajan(Persona[] matriz){
        int contador = 0;
        int total = matriz.length;
        float porcentaje = 0;
        for (Persona persona : matriz){
            if (persona.getSexo() == 2 && persona.getTrabajo() == 1){
                contador++;
            }
        }
        porcentaje = (contador * 100 / total);
        return porcentaje;
    }

    public static float sueldoHombresQueTrabajan(Persona[] matriz){
        int contador = 0;
        int sueldo = 0;
        float promedio = 0;
        for (Persona persona : matriz){
            if (persona.getSexo() == 1 && persona.getTrabajo() == 1){
                contador++;
                sueldo += persona.getSueldo();
            }
        }
        promedio = sueldo / contador;
        return promedio;
    }

    public static float sueldoMujeresQueTrabajan(Persona[] matriz){
        int contador = 0;
        int sueldo = 0;
        float promedio = 0;
        for (Persona persona : matriz){
            if (persona.getSexo() == 2 && persona.getTrabajo() == 1){
                contador++;
                sueldo += persona.getSueldo();
            }
        }
        promedio = sueldo / contador;
        return promedio;
    }
}

