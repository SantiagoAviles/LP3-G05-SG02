public class Cuenta {
    private String numeroCuenta;
    private double saldo;

    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        if (saldo < 50){
            this.saldo = 50;
        } else{
            this.saldo = saldo;
        }
    }

    public Cuenta(String numeroCuenta) {
        this (numeroCuenta, 50);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double monto) {
        if (monto - this.saldo < 50 ) {
            this.saldo -= monto;
            System.out.println("Retiro satisfactorio. Nuevo saldo del cliente: " + getSaldo());
        } else {
            System.out.println("No se puede retirar el monto especificado: Saldo no puede ser menor de 50.");
        }
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito satisfactorio. Nuevo saldo del cliente: " + getSaldo());
    }

    @Override
    public String toString() {
        return "Número de cuenta: " + getNumeroCuenta() + "\n" +
                "Saldo: " + getSaldo();
    }
}
