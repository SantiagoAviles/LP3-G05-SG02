public class Soda extends Biscuits {
   private String brand;

   public Soda(String name, String type, String brand) {
       super(name, type);
       this.brand = brand;
   }

   public String getBrand() {
       return brand;
   }

   public void setBrand(String brand) {
       this.brand = brand;
   }

    @Override
    public String toString() {
        return getClass().getName() + ": Marca: " + brand;
    }
}

