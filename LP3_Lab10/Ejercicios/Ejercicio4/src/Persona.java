public class Persona {
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
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Persona persona = (Persona) obj;
        if (nombres != persona.nombres) {
            return false;
        } else{
            return true;
        }
    }
}
