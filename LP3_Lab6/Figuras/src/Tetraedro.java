public class Tetraedro extends FiguraTridimensional {
    private double lado;
    private String aplicacion = "Egipto";
    public Tetraedro(double lado) {
        this.lado = lado;
    }
    public String getAplicacion() {
        return aplicacion;
    }
    public double getLado(){
        return lado;
    }
    @Override
    public double getArea() {
        return Math.pow(getLado(), 2) * Math.sqrt(3);
    }
    @Override
    public double getVolumen() {
        return Math.pow(getLado(), 3) * Math.sqrt(2) / 12;
    }
    @Override
    public String getDescripcion() {
        return "Tetraedro regular de lado " + lado;
    }
}

