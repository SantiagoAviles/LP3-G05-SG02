public class Triangulo extends FiguraBidimensional {
    private double base;
    private double altura;
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }
    @Override
    public double getArea() {
        return ( getBase() * getAltura() ) / 2;
    }
    @Override
    public String getDescripcion() {
        return "Triángulo de base " + getBase() + " y altura " + getAltura();
    }
}

