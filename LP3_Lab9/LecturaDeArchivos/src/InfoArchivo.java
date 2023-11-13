import java.io.File;

public class InfoArchivo {
    public static void main(String[] args) {
        if (args.length > 0){
            for (int i = 0; i < args.length; i++){
                File f = new File(args[i]);
                System.out.println("Nombre: " + f.getName());
                System.out.println("Ruta: " + f.getPath());
                if (f.exists()){
                    System.out.println("El archivo existe!");
                    System.out.println((f.canRead() ? "Se puede leer el archivo! " : ""));
                    System.out.println((f.canWrite() ? "Se puede escribir en el archivo!" : ""));
                    System.out.println("");
                    System.out.println("La longitud del archivo es de " + f.length() + " bytes!");
                    System.out.println("");
                }
            }
        }
        else{
            System.out.println("Debe indicar un archivo...");
        }
    }
}
