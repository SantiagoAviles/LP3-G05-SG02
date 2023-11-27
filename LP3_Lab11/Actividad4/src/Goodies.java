public class Goodies {
   private String name;

   public Goodies(String name) {
       this.name = name;
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

    @Override
    public String toString() {
        return getClass().getName() + ": Nombre: " + name;
    }
}

