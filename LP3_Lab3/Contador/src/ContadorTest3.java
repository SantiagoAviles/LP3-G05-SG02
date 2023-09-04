public class ContadorTest3 {
    public static void main(String[] args){
        Contador c4, c5;
        c4 = new Contador(3);
        c5 = new Contador();
        System.out.println(Contador.getTotalContadores());
        System.out.println(Contador.getUltimoContador());
    }
}