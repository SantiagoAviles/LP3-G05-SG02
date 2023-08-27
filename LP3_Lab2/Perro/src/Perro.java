public class Perro {
    private String raza;
    private String color;
    private double temp;
    private int edad;
    public double peso;
    public Perro(String raza, String color, double temp, int edad, double peso) {
        this.raza = raza;
        this.color = color;
        this.temp = temp;
        this.edad = edad;
        this.peso = peso;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getTemp() {
        return temp;
    }
    public void setTemp(double temp) {
        this.temp = temp;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Informacion del perro => " + "Raza: " + raza + ", Color: " + color + ", Temperatura: " + temp + ", Edad: " + edad + ", Peso: " + peso;
    }
    public void ladrar(){
        System.out.println("Guau guau!");
    }
    public void dormir(){
        System.out.println("Zzz...");
    }
    public void comer(){
        System.out.println("Comiendo...");
    }
    public void increEdad(int anios){
        this.edad = this.edad + anios;
        cambiarPeso(anios);
    }
    private void cambiarPeso(int anios){
        this.peso = this.peso + (anios * 1.5);
    }
}
           

