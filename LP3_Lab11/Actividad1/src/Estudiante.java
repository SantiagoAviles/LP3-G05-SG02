public class Estudiante extends Persona {
   String especialidad;
   Procedencia procedencia;
   
   public Estudiante(String nombre, String direccion, String telefono, String especialidad, Procedencia procedencia) {
      super(nombre, direccion, telefono);
      this.especialidad = especialidad;
      this.procedencia = procedencia;
   }
   
   public String getEspecialidad() {
      return especialidad;
   }
   public void setEspecialidad(String especialidad) {
      this.especialidad = especialidad;
   }
   public Procedencia getProcedencia() {
      return procedencia;
   }
   public void setProcedencia(Procedencia procedencia) {
      this.procedencia = procedencia;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (!super.equals(obj)) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      Estudiante other = (Estudiante) obj;
      if (especialidad == null) {
         if (other.especialidad != null) {
            return false;
         }
      } else if (!especialidad.equals(other.especialidad)) {
         return false;
      }
      if (procedencia == null) {
         if (other.procedencia != null) {
            return false;
         }
      } else if (!procedencia.equals(other.procedencia)) {
         return false;
      }
      return true;
   }
}


