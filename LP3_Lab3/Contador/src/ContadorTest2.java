public class ContadorTest2 {
    public static void main(String[] args){
        Contador c3;
        
        System.out.println(Contador.acumulador());
        c3 = new Contador();
        System.out.println(c3.getValor());
        c3.inc();
        System.out.println(c3.getValor());
    }
}
