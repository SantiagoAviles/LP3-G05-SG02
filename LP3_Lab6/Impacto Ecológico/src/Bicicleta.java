public class Bicicleta implements ImpactoEcologico {
    private double kilometrosRecorridos;

    public Bicicleta(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    @Override
    public double getImpactoEcologico() {
        double datoActividad = getKilometrosRecorridos();
        double factorDeEmision = 0.05;
        return datoActividad * factorDeEmision;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": Kilómetros recorridos: " + getKilometrosRecorridos();
    }
}

