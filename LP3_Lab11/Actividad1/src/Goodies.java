public class Goodies {
   int id;
   String description;
   float price;
   
   public Goodies(int id, String description, float price) {
      this.id = id;
      this.description = description;
      this.price = price;
   }
   
   public int getId() {
      return id;
   }
   public void setId(int id) {
      this.id = id;
   }
   public String getDescription() {
      return description;
   }
   public void setDescription(String description) {
      this.description = description;
   }
   public float getPrice() {
      return price;
   }
   public void setPrice(float price) {
      this.price = price;
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
      Goodies other = (Goodies) obj;
      if (id != other.id) {
         return false;
      }
      return true;
   }
}

