public class Cuadrado extends FiguraBidimensional {
    private double lado;
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    public double getLado(){
        return lado;
    }
    @Override
    public double getArea() {
        return Math.pow(getLado(), 2);
    }
    @Override
    public String getDescripcion() {
        return "Cuadrado de lado " + getLado();
    }
}

