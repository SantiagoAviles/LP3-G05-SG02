import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class LeerEntrada {
    private Reader stream;

    public LeerEntrada(InputStream fuente){
        stream = new InputStreamReader(fuente);
    }

    public char getChar() throws IOException{
        return (char) this.stream.read();
    }

    public void procesar() throws ExcepcionVocal, ExcepcionNumero, ExcepcionBlanco, ExcepcionSalida {
        try {
            char caracter = getChar();
            switch (caracter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    throw new ExcepcionVocal();
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    throw new ExcepcionNumero();
                case ' ':
                    throw new ExcepcionBlanco();
                case 's':
                    throw new ExcepcionSalida();
                default:
                    System.out.println("Se ingresó otro caracter");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el carácter: " + e.getMessage());
        } 
    }
}
