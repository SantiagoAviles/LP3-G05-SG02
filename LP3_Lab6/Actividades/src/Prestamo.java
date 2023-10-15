public class Prestamo implements PorPagar {
    private int numeroDeCuotas;
    private double montoDeCuota;

    public Prestamo(int numeroDeCuotas, double montoDeCuota) {
        this.numeroDeCuotas = numeroDeCuotas;
        this.montoDeCuota = montoDeCuota;
    }

    public int obtenerNumeroDeCuotas() {
        return numeroDeCuotas;
    }
    public void establecerNumeroDeCuotas(int numeroDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
    }
    public double obtenerMontoDeCuota() {
        return montoDeCuota;
    }
    public void establecerMontoDeCuota(double montoDeCuota) {
        this.montoDeCuota = montoDeCuota;
    }

    @Override
    public double obtenerMontoPago(){
        return obtenerNumeroDeCuotas() * obtenerMontoDeCuota();
    }

    @Override
    public String toString() {
        return getClass().getName() + ": \nNúmero de Cuotas: " + numeroDeCuotas + 
        " \nMonto de Cuota: " + montoDeCuota;
    }
}

