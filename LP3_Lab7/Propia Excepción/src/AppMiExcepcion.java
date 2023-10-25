public class AppMiExcepcion {
    public static void main(String[] args) {
        validaPropia(11);
    }
    public static void validaPropia(int n){
        try{
            minimo(n);
            System.out.println(n + " es mayor a 10");
        }
        catch(MiExcepcion e){
            System.out.println("Este número no es válido");
        }
    }

    public static void minimo(int numero) throws MiExcepcion{
        if (numero <= 10){
            throw new MiExcepcion("Necesito un número mayor a 10");
        }
    }
}

