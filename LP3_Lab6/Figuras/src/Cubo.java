public class Cubo extends FiguraTridimensional {
    private double lado;
    public Cubo(double lado) {
        this.lado = lado;
    }
    public double getLado(){
        return lado;
    }
    @Override
    public double getArea() {
        return 6 * Math.pow(getLado(), 2);
    }
    @Override
    public double getVolumen() {
        return Math.pow(getLado(), 3);
    }
    @Override
    public String getDescripcion() {
        return "Cubo de lado " + getLado();
    }
}

