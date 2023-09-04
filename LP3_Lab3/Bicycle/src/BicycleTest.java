public class BicycleTest {
    public static void main(String[] args){
        Bicycle a,b;
        a = new Bicycle("Adam Smith", 1);
        b = new Bicycle("Ben Jones",5);
        a.distanceTraveled(240);
        System.out.println(b.getOwnerName());
        b.distanceTraveled(1100);
        Bicycle mostOld = Bicycle.mostUsed(a, b);
        System.out.println(mostOld);
    }
}


