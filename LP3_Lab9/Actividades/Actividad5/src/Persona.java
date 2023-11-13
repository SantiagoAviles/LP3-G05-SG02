public class Persona{
    protected String nombre;
    protected String telefono;
    protected String direccion;
    public Persona(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    public String getNombre(){
        return nombre;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getDireccion(){
        return direccion;
    }
    public String toString() {
        return getNombre() + "\t" + getTelefono() + "\t" + getDireccion() + "\n";
    }
}