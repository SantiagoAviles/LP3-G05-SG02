public class ArrayContenedora<T> implements Contenedora<T> {
   T[] arreglo;

   public ArrayContenedora(T[] arreglo) {
       this.arreglo = arreglo;
   }

   @Override
   public boolean contiene(T valor) {
       for (T objeto : arreglo) {
           if (objeto.equals(valor)) {
               return true;
           }
       }
       return false;
   }
}

