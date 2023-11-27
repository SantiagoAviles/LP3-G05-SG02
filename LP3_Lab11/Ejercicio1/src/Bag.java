public class Bag<T> {
    protected T[] list;
    protected int count;

    public Bag(int n) {
        this.list = (T[]) new Object[n];
        this.count = 0;
    }

    public void add(T obj) throws IsFull {
        if (count == list.length) {
            throw new IsFull("La bolsa está llena...");
        }
        list[count] = obj;
        count++;
    }

    public T[] getObjects() throws IsEmpty {
        if (count == 0) {
            throw new IsEmpty("La bolsa se encuentra vacía...");
        }
        return list;
    }

    public T remove(T obj) throws ObjectDoesntExist {
        int index = getIndex(obj);
        if (index == -1) {
            throw new ObjectDoesntExist("El objeto no existe en la bolsa");
        }
        T removedObj = list[index];
        for (int i = index; i < count - 1; i++) {
            list[i] = list[i + 1];
        }
        count--;
        return removedObj;
    }

    public int getIndex(T obj) {
        for (int i = 0; i < count; i++) {
            if (list[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(list[i].toString());
            if (i < count - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}