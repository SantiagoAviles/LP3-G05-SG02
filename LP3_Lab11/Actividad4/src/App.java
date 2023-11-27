public class App {
    public static void main(String[] args) {
        try {
            Bag<Goodies> bag = new Bag<>(10);
            Biscuits biscuit = new Biscuits("Chocolate Chip", "Chocolate");
            Chocolates chocolate = new Chocolates("Dark Chocolate", "Dark");
            Soda soda = new Soda("Coke", "Sweet", "Coca Cola");
            Sweet sweet = new Sweet("Gummy Bears", "Chewy", "Medium");
            bag.add(biscuit);
            bag.add(chocolate);
            bag.add(soda);
            bag.add(sweet);
            bag.getObjects();
            System.out.println(bag.toString());
            bag.remove(biscuit);
            System.out.println(bag.toString());

        } catch (IsFull e) {
            System.out.println(e.getMessage());
        } catch (IsEmpty e) {
            System.out.println(e.getMessage());
        } catch (ObjectDoesntExist e) {
            System.out.println(e.getMessage());
        }
    }
}

