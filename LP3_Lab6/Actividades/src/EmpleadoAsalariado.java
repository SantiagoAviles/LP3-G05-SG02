public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario){
        super(nombre, apellido, nss);
        establecerSalarioSemanal(salario);
    }

    public double obtenerSalarioSemanal(){
        return salarioSemanal;
    }

    public void establecerSalarioSemanal(double monto){
        salarioSemanal = monto;
    }

    @Override
    public double obtenerMontoPago(){
        return obtenerSalarioSemanal();
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalario semanal: " + salarioSemanal;
    }
}
