public class App {
    public static void main(String[] args) {
        double[] v = new double[15];
        try {
            acceso(v, 16);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static double acceso(double[] v, int j) throws Exception {
        if (j >= 0 && j < v.length) {
            return v[j];
        } else {
            throw new Exception("El índice " + j + " no existe en el vector ");
        }
    }
}