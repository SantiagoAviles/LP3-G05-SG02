import java.util.ArrayList;

public class Dictionary<K, V> {
   private ArrayList<Pair<K, V>> listaPares;

   public Dictionary() {
       this.listaPares = new ArrayList<>();
   }
   public void add(K llave, V valor) {
       listaPares.add(new Pair<>(llave, valor));
   }
   public boolean delete(K llave) {
       for (Pair<K, V> par : listaPares) {
           if (par.getKey().equals(llave)) {
               listaPares.remove(par);
               return true;
           }
       }
       return false;
   }
   public V getValue(K llave) throws ObjectDoesntExist {
       for (Pair<K, V> par : listaPares) {
           if (par.getKey().equals(llave)) {
               return par.getValue();
           }
       }
       throw new ObjectDoesntExist("La llave no existe");
   }
   @Override
   public String toString() {
       StringBuilder sb = new StringBuilder();
       for (Pair<K, V> par : listaPares) {
           sb.append(par.toString()).append("\n");
       }
       return sb.toString();
   }
}

