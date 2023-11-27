public class Pair<K, V> {
   private K llave;
   private V valor;

   public Pair(K llave, V valor) {
       this.llave = llave;
       this.valor = valor;
   }

   public K getKey() {
       return llave;
   }
   public V getValue() {
       return valor;
   }

   @Override
   public String toString() {
       return "Llave: " + llave + " Valor: " + valor;
   }
}
