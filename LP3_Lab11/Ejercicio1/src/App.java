public class App {
   public static void main(String[] args) {
       CandyBags bag = new CandyBags(10);
       try {
           bag.add(new Goodies("Chocolate", 1.99));
           bag.add(new Goodies("Gummy Bears", 2.49));
           bag.add(new Goodies("Lollipops", 0.99));
           System.out.println("Cheapest candy: " + bag.cheapest());
           System.out.println("Most expensive candies: " + bag.mostExpensive(2));
       } catch (IsFull | IsEmpty | ObjectAlreadyExists e) {
           e.printStackTrace();
       }
   }
}