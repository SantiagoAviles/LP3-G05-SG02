public class VentasEmpresa {
    public static void main(String[] args) {
        // Crear un arreglo bidimensional para almacenar las ventas
        int[][] ventas = new int[4][5];

        // Supongamos que tienes información de ventas en forma de una matriz de notas
        int[][] notasDeVenta = {
            {1, 1, 100},
            {1, 2, 150},
            {2, 1, 200},
            // Agrega más notas de venta aquí...
        };

        // Procesar las notas de venta y acumular las ventas en el arreglo bidimensional
        for (int[] nota : notasDeVenta) {
            int vendedor = nota[0];
            int producto = nota[1];
            int valor = nota[2];
            ventas[vendedor - 1][producto - 1] += valor;
        }

        // Calcular las ventas totales por vendedor y por producto
        int[] ventasTotalesVendedor = new int[4];
        int[] ventasTotalesProducto = new int[5];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                ventasTotalesVendedor[i] += ventas[i][j];
                ventasTotalesProducto[j] += ventas[i][j];
            }
        }

        // Imprimir los resultados en formato tabular
        System.out.println("Ventas por Producto:");
        for (int producto = 0; producto < 5; producto++) {
            System.out.println("Producto " + (producto + 1) + ": " + ventasTotalesProducto[producto]);
        }

        System.out.println("\nVentas por Vendedor:");
        for (int vendedor = 0; vendedor < 4; vendedor++) {
            System.out.println("Vendedor " + (vendedor + 1) + ": " + ventasTotalesVendedor[vendedor]);
        }

        // Calcular y mostrar las ventas totales generales
        int ventasTotalesGenerales = 0;
        for (int total : ventasTotalesVendedor) {
            ventasTotalesGenerales += total;
        }
        System.out.println("\nVentas Totales Generales: " + ventasTotalesGenerales);
    }
}