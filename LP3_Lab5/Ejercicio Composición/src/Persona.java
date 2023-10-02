public class Persona {
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    private char tipoCliente;

    private static int id = 1;
    private static int contadorCliente = 1000;
    private static int contadorBanca = 5000;
    private static int contadorEmpresarial = 8000;

    public Persona(String nombre, String apellido, char tipoCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoCliente = tipoCliente;

        String numeroCuenta;

        if (this.tipoCliente == 'C') {
            numeroCuenta = "C" + contadorCliente;
            contadorCliente++;
        } else if (this.tipoCliente == 'B') {
            numeroCuenta = "B" + contadorBanca;
            contadorBanca++;
        } else {
            numeroCuenta = "E" + contadorEmpresarial;
            contadorEmpresarial++;
        }

        this.cuenta = new Cuenta(numeroCuenta);

        id++;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoCliente = 'C';

        String numeroCuenta;

        numeroCuenta = "C" + contadorCliente;
        contadorCliente++;

        this.cuenta = new Cuenta(numeroCuenta);

        id++;
    }

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public char getTipoCliente() {
        return tipoCliente;
    }
    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    public Cuenta getCuenta() {
        return cuenta;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "\n" +
                "Tipo de Cuenta: " + getTipoCliente() + "\n" +
                "Nombres: " + getNombre() + " " + getApellido() + "\n" +
                "Número de cuenta: " + cuenta.getNumeroCuenta() + "\n" +
                "Saldo: " + cuenta.getSaldo();
    }
}
