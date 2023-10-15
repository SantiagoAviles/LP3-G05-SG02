public class Edificio implements ImpactoEcologico {
    private double usoEnergia;
    private double tiempoVida;

    public Edificio(double usoEnergia, double tiempoVida) {
        this.usoEnergia = usoEnergia;
        this.tiempoVida = tiempoVida;
    }
    
    public double getUsoEnergia() {
        return usoEnergia;
    }
    public double getTiempoVida() {
        return tiempoVida;
    }

    @Override
    public double getImpactoEcologico() {
        double datoActividad = getUsoEnergia() * getTiempoVida();
        double factorDeEmision = 0.5;
        return datoActividad * factorDeEmision;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": Uso de energía: " + getUsoEnergia() + " Tiempo de vida: " + getTiempoVida();
    }
}

