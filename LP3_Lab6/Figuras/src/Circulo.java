public class Circulo extends FiguraBidimensional {
    private double radio;
    private String color = "Rojo";
    public Circulo(double radio) {
        this.radio = radio;
    }
    public double getRadio(){
        return radio;
    }
    public String getColor(){
        return color;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRadio(), 2);
    }
    @Override
    public String getDescripcion() {
        return "Círculo de radio " + getRadio();
    }
}

