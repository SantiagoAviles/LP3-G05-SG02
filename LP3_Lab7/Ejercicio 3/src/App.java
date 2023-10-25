public class App {
    public static void main(String[] args) {
        LeerEntrada leerEntrada = new LeerEntrada(System.in);
        while (true) {
            try {
                leerEntrada.procesar();
            } catch (ExcepcionVocal e) {
                System.out.println(e.getMessage());
            } catch (ExcepcionNumero e) {
                System.out.println(e.getMessage());
            } catch (ExcepcionBlanco e) {
                System.out.println(e.getMessage());
            } catch (ExcepcionSalida e) {
                System.out.println(e.getMessage());
                break;
            } 
        }
    }
}
