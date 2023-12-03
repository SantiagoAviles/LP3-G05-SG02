import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Insertar {
    public static void main(String[] args) throws Exception {
        try {
            Connection conexion = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/grupo05", "root", "admin");
            Statement stmt = conexion.createStatement();
            String insertSql = "INSERT INTO perros(id, nombre, raza) VALUES('6', 'Jefferson', 'Chihuahua')";
            stmt.executeUpdate(insertSql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

