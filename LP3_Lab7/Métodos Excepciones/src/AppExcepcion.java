public class AppExcepcion {
    public static void main(String[] args){
        try{
            metodo1();
        }
        catch (Exception excepcion){
            System.out.println("La excepción se manejó en el programa principal");
        }
        metodo2();
    }

    public static void metodo1() throws Exception{
        try{
            System.out.println("Método 1");
            throw new Exception();
        }
        catch (Exception exception){
            System.out.println("La excepción se manejó en el método 1");
            throw exception;
        }
        finally{
            System.out.println("Se ejecutó el método finally en el método 1");
        }
    }
    public static void metodo2(){
        try{
            System.out.println("Método 2");
        }
        catch (Exception exception){
            System.out.println(exception);
        }
        finally{
            System.out.println("Se ejecutó el método finally en el método 2");
        }
        System.out.println("Fin del método 2");
    }
}
