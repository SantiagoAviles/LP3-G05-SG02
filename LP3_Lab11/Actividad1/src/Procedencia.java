public class Procedencia {
   String departamento;
   String provincia;

   public Procedencia(String departamento, String provincia) {
      this.departamento = departamento;
      this.provincia = provincia;
   }
   public String getDepartamento() {
      return departamento;
   }
   public void setDepartamento(String departamento) {
      this.departamento = departamento;
   }
   public String getProvincia() {
      return provincia;
   }
   public void setProvincia(String provincia) {
      this.provincia = provincia;
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
      Procedencia other = (Procedencia) obj;
      if (departamento == null) {
         if (other.departamento != null) {
            return false;
         }
      } else if (!departamento.equals(other.departamento)) {
         return false;
      }
      if (provincia == null) {
         if (other.provincia != null) {
            return false;
         }
      } else if (!provincia.equals(other.provincia)) {
         return false;
      }
      return true;
   }  
}

