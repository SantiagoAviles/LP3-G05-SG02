import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<ImpactoEcologico> listaImpactos = new ArrayList<>();

        Edificio edificio = new Edificio(1000, 10);
        Auto auto = new Auto(1000, 5);
        Bicicleta bicicleta = new Bicicleta(50);

        listaImpactos.add(edificio);
        listaImpactos.add(auto);
        listaImpactos.add(bicicleta);

        for (ImpactoEcologico impactoEcologico : listaImpactos) {
            System.out.println(impactoEcologico.toString());
            System.out.println("Impacto Ecológico: " + impactoEcologico.getImpactoEcologico() + "\n");
        }
    }
}

