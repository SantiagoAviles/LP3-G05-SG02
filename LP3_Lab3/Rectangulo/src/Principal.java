public class Principal {
    public static void main(String[] args){
        Rectangulo rectangulo = new Rectangulo(new Coordenada(0, 0), new Coordenada(10, 5));
        double area = Manejador.area(rectangulo);
        double perimetro = Manejador.perimetro(rectangulo);

        System.out.println("Área: " + area);
        System.out.println("Perimetro: " + perimetro);

        Manejador.moverX(rectangulo, 3);
        Manejador.moverY(rectangulo, 2);

        System.out.println(rectangulo);
        System.out.println("Color rectángulo 1: " + rectangulo.getColor());

        Rectangulo rectangulo2 = new Rectangulo(4,2);
        System.out.println("Color rectángulo 2: " + rectangulo2.getColor());

        Rectangulo rectangulo3 = new Rectangulo(4,2);
        System.out.println("Color rectángulo 3: " + rectangulo3.getColor());

        Rectangulo rectangulo4 = new Rectangulo(4,2);
        System.out.println("Color rectángulo 4: " + rectangulo4.getColor());

        Rectangulo rectangulo5 = new Rectangulo(4,2);
        System.out.println("Color rectángulo 5: " + rectangulo5.getColor());
    }
}
