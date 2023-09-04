public class Manejador {
    public static double area(Rectangulo rectangulo) {
        double base = Math.abs(rectangulo.getEsquina2().getX() - rectangulo.getEsquina1().getX());
        double altura = Math.abs(rectangulo.getEsquina2().getY() - rectangulo.getEsquina1().getY());
        return base * altura;
    }

    public static double perimetro(Rectangulo rectangulo) {
        double base = Math.abs(rectangulo.getEsquina2().getX() - rectangulo.getEsquina1().getX());
        double altura = Math.abs(rectangulo.getEsquina2().getY() - rectangulo.getEsquina1().getY());
        return 2 * (base + altura);
    }

    public static void moverX(Rectangulo rectangulo, int puntos) {
        rectangulo.getEsquina1().setX(rectangulo.getEsquina1().getX() + puntos);
        rectangulo.getEsquina2().setX(rectangulo.getEsquina2().getX() + puntos);
    }

    public static void moverY(Rectangulo rectangulo, int puntos) {
        rectangulo.getEsquina1().setY(rectangulo.getEsquina1().getY() + puntos);
        rectangulo.getEsquina2().setY(rectangulo.getEsquina2().getY() + puntos);
    }
}

