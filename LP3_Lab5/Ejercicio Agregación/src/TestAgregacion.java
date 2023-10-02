public class TestAgregacion {
    public static void main(String[] args){
        Motor motor = new Motor(1234, 2000);
        Automovil automovil1 = new Automovil("ABC123", 4, "Toyota", "Corolla");
        automovil1.setMotor(motor);

        Automovil automovil2 = new Automovil("DEF456", 4, "Chevrolet", "Camaro");

        System.out.println(automovil1.toString());
        System.out.println(automovil2.toString());
    }
}
