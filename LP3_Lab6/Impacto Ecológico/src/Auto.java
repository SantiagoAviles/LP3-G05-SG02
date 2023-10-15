public class Auto implements ImpactoEcologico {
    private double consumoCombustible;
    private double tiempoUso;
    
    public Auto(double consumoCombustible, double tiempoUso) {
        this.consumoCombustible = consumoCombustible;
        this.tiempoUso = tiempoUso;
    }
    
    public double getConsumoCombustible() {
        return consumoCombustible;
    }
    public double getTiempoUso() {
        return tiempoUso;
    }

    @Override
    public double getImpactoEcologico() {
        double datoActividad = getConsumoCombustible() / getTiempoUso();
        double factorDeEmision = 0.3;
        return datoActividad * factorDeEmision;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": Consumo de combustible: " + getConsumoCombustible() + " Tiempo de uso: " + getTiempoUso();
    }
}

