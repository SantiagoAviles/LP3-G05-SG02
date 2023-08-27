public class Diagnostico {
    public void aptoVacunaA(Perro p1){
        double temp = p1.getTemp();
        double peso = p1.peso;
        double edad = p1.getEdad();

        if(temp>=37 && temp<=40 && peso>5 && edad>1)
            System.out.println("El perro esta sano");
        else
            System.out.println("El perro esta enfermo...");
    }

    public void aptoVacunaB(double temp, int edad, double peso){
        if(temp>=37 && temp<=40 && peso>5 && edad>1)
            System.out.println("El perro esta sano");
        else
            System.out.println("El perro esta enfermo...");
    }
}
