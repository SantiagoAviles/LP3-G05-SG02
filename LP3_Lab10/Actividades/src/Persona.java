public class Persona implements Comparable<Persona>{
    private int DNI;
    private String nombre;
    private String direccion;

    public Persona(int dNI, String nombre, String direccion) {
        DNI = dNI;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public int getDNI() {
        return DNI;
    }
    public void setDNI(int dNI) {
        DNI = dNI;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "DNI: " + DNI + " Nombre: " + nombre + " Dirección: " + direccion + "\n";
    }

    @Override
    public int compareTo(Persona persona) {
        return this.nombre.compareTo(persona.nombre);
     }
}
