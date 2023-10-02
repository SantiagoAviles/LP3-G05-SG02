public class TestAgregacion {
    public static void main(String[] args){
        Automovil a1 = new Automovil("VAA-001",4,"Chevrolet","Camaro");
        Automovil a2 = new Automovil("VAA-002",4,"Toyota","Corolla");
        Automovil a3 = new Automovil("VAA-003",4,"Ford","Mustang");

        Motor m1 = new Motor(1, 1000);
        Motor m2 = new Motor(2, 500);

        a1.setMotor(m1);
        a2.setMotor(m2);

        System.out.println(a1.toString());
        System.out.println(m1.toString());
        System.out.println(a2.toString());
        System.out.println(m2.toString());
        System.out.println(a3.toString());
    }
}
