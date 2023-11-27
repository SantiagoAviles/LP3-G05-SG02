public class Sweet extends Biscuits {
   private String size;

   public Sweet(String name, String type, String size) {
       super(name, type);
       this.size = size;
   }

   public String getSize() {
       return size;
   }

   public void setSize(String size) {
       this.size = size;
   }

    @Override
    public String toString() {
        return getClass().getName() + ": Tamaño: " + size;
    }
}

