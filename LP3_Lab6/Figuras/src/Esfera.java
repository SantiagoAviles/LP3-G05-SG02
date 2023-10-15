public class Esfera extends FiguraTridimensional {
    private double radio;
    public Esfera(double radio) {
        this.radio = radio;
    }
    public double getRadio(){
        return radio;
    }
    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(getRadio(), 2);
    }
    @Override
    public double getVolumen() {
        return 4 / 3 * Math.PI * Math.pow(getRadio(), 3);
    }
    @Override
    public String getDescripcion() {
        return "Esfera de radio " + getRadio();
    }
}


