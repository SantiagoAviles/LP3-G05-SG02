import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Transacciones {
    public static void main(String[] args) throws Exception {
        Connection conexion = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/grupo05", "root", "admin");
       try {
           conexion.setAutoCommit(false);
           Statement stmt = conexion.createStatement();
           stmt.executeUpdate("INSERT INTO perros (id, nombre, raza) VALUES ('9', 'James', 'Pomerania')");
           conexion.commit();
           System.out.println("Transacción completada");
       } catch (SQLException e) {
           if(conexion != null) {
               conexion.rollback();
           }
           System.out.println("Transacción no completada");
           System.out.println(e.getMessage());
       }
    }
}
