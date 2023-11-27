public class Chocolates extends Goodies {
   private String flavor;

   public Chocolates(String name, String flavor) {
       super(name);
       this.flavor = flavor;
   }

   public String getFlavor() {
       return flavor;
   }

   public void setFlavor(String flavor) {
       this.flavor = flavor;
   }

    @Override
    public String toString() {
        return getClass().getName() + ": Sabor: " + flavor;
    }
}

