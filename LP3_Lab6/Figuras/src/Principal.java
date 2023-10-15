public class Principal {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[]{
            new Circulo(5), new Cuadrado(4), new Triangulo(6,8),
            new Esfera(10), new Cubo(8), new Tetraedro(3),
        };

        for (Figura figura : figuras) {
            System.out.println(figura.getDescripcion());

            if (figura instanceof FiguraBidimensional) {
                FiguraBidimensional figuraBidimensional = (FiguraBidimensional) figura;
                System.out.println("Área de la figura bidimensional: " + figuraBidimensional.getArea() + "\n");

                if (figura instanceof Circulo) {
                    Circulo circulo = (Circulo) figura;
                    System.out.println("Color del círculo: " + circulo.getColor() + "\n");
                }
                
            } else if (figura instanceof FiguraTridimensional) {
                FiguraTridimensional figuraTridimensional = (FiguraTridimensional) figura;
                System.out.println("Área de la figura tridimensional: " + figuraTridimensional.getArea() 
                + ", Volumen de la figura tridimensional: " + figuraTridimensional.getVolumen() + "\n");

                if (figura instanceof Tetraedro) {
                    Tetraedro tetraedro = (Tetraedro) figura;
                    System.out.println("Aplicación del tetraedro: " + tetraedro.getAplicacion() + "\n");
                }
            }
        }
    }
}


