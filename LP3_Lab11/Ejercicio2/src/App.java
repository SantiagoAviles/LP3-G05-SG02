public class App {
    public static void main(String[] args) {
        Dictionary<Integer, String> diccionario = new Dictionary<>();
        diccionario.add(123, "Hola");
        diccionario.add(548, "buenos");
        diccionario.add(230, "días");
        System.out.println(diccionario.toString());
        try {
            System.out.println("Valor de la primera llave: " + diccionario.getValue(123));
        } catch (ObjectDoesntExist e) {
            System.out.println(e.getMessage());
        }
        System.out.println("¿Se eliminó la segunda llave? : " + diccionario.delete(548));
        System.out.println(diccionario.toString());
        try {
            System.out.println("Valor de la segunda llave: " + diccionario.getValue(548));
        } catch (ObjectDoesntExist e) {
            System.out.println(e.getMessage());
        }
    }
}

