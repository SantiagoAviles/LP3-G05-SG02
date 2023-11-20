class Persona {
    protected int dni;
    protected String nombres;
    protected String direccion;

    public Persona(int dni, String nombres, String direccion) {
        this.dni = dni;
        this.nombres = nombres;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + " Nombres: " + nombres + " Dirección: " + direccion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Persona persona = (Persona) obj;
        return nombres.equals(persona.nombres);
    }
}
