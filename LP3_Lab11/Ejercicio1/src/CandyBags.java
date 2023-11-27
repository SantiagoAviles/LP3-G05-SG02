import java.util.Arrays;
import java.util.Comparator;

public class CandyBags extends Bag<Goodies> {

    public CandyBags(int n) {
        super(n);
        this.count = 0;
    }

    @Override
    public void add(Goodies obj) throws IsFull, ObjectAlreadyExists {
        if (getIndex(obj) != -1) {
            throw new ObjectAlreadyExists("El objeto ya está en la bolsa");
        }
        super.add(obj);
    }

    public Goodies cheapest() throws IsEmpty {
        if (count == 0) {
            throw new IsEmpty("La bolsa está vacía");
        }
        Goodies cheapest = list[0];
        for (int i = 1; i < count; i++) {
            if (list[i].getPrice() < cheapest.getPrice()) {
                cheapest = list[i];
            }
        }
        return cheapest;
    }

    public CandyBags mostExpensive(int n) throws IsEmpty {
        if (count == 0) {
            throw new IsEmpty("La bolsa está vacía");
        }
        Goodies[] sortedList = Arrays.copyOf(list, count);
        Arrays.sort(sortedList, Comparator.comparing(Goodies::getPrice).reversed());
        Goodies[] topN = Arrays.copyOfRange(sortedList, 0, n);
        CandyBags topNBags = new CandyBags(n);
        for (Goodies candy : topN) {
            topNBags.add(candy);
        }
        return topNBags;
    }
}