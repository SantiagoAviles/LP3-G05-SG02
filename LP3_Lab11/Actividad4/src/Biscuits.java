public class Biscuits extends Goodies {
   private String type;

   public Biscuits(String name, String type) {
       super(name);
       this.type = type;
   }

   public String getType() {
       return type;
   }

   public void setType(String type) {
       this.type = type;
   }

    @Override
    public String toString() {
        return getClass().getName() + ": Tipo: " + type;
    }
}

