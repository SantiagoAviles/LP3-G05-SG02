import javax.swing.JFrame;

public class PruebaJFileChooser {
    public static void main(String[] args) throws Exception {
        DemoJFileChooser aplicacion = new DemoJFileChooser();
        aplicacion.setSize(400,400);
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setVisible(true);
    }
}
