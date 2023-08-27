class CuentaBanco {
    private String titular;
    private double cantidad;

    public CuentaBanco(String titular) {
        this.titular = titular;
    }

    public CuentaBanco(String titular, double cantidad) {
        this.titular = titular;
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (this.cantidad - cantidad >= 0) {
            this.cantidad -= cantidad;
        } else {
            this.cantidad = 0;
        }
    }

    @Override
    public String toString() {
        return "Titular: " + titular + "\nCantidad: " + cantidad;
    }
}
