import java.util.Random;

public class Persona {
    private int sexo;
    private int trabajo;
    private int sueldo;

    public Persona(int sexo, int trabajo, int sueldo){
        this.sexo = sexo;
        this.trabajo = trabajo;
        this.sueldo = sueldo;
    }

    public int getSexo(){
        return sexo;
    }

    public int getTrabajo(){
        return trabajo;
    }

    public int getSueldo(){
        return sueldo;
    }

    public static void aleatorizador(Persona persona){
        Random aleatorizador = new Random();
        int numeroAlAzarS = aleatorizador.nextInt(2) + 1;
        int numeroAlAzarT = aleatorizador.nextInt(2) + 1;
        persona.sexo = numeroAlAzarS;
        persona.trabajo = numeroAlAzarT;
        persona.sueldo = 0;
        if (persona.trabajo == 1){
            int numeroAlAzarSueldo = aleatorizador.nextInt(2100) + 900;
            persona.sueldo = numeroAlAzarSueldo;
        }
    }

    @Override
    public String toString() {
        String sexoString, trabajoString;
        if (this.sexo == 1){
            sexoString = "Masculino";
        }
        else{
            sexoString = "Femenino";
        }

        if (this.trabajo == 1){
            trabajoString = "Sí.";
        }
        else{
            trabajoString = "No.";
        }

        return "Información de la persona: \n" + "\n" +
                "Sexo: " + sexoString + "\n" +
                "Tiene trabajo?: " + trabajoString + "\n" +
                "Sueldo: " + this.sueldo;
    }
}


