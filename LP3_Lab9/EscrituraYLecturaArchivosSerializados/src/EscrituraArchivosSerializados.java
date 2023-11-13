import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraArchivosSerializados {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Persona p;

        try{
            fos = new FileOutputStream("C:/ficheros/personas.dat");
            salida = new ObjectOutputStream(fos);

            p = new Persona("123456789A", "Jorge Gonzáles", 30);
            salida.writeObject(p);

            p = new Persona("98765432B", "Carlos Jiménez", 28);
            salida.writeObject(p);

            p = new Persona("934635453D", "María Zapata", 35);
            salida.writeObject(p);
        } catch (FileNotFoundException e){
            System.out.println("1" + e.getMessage());
        } catch (IOException e){
            System.out.println("2" + e.getMessage());
        } finally {
            try{
                if (fos != null){
                    fos.close();
                }
                if (salida != null){
                    salida.close();
                }
            } catch (IOException e){
                System.out.println("3" + e.getMessage());
            }
        }
    }
}
