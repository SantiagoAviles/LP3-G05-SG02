import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Borrar {
    public static void main(String[] args) throws Exception {
        try {
            Connection conexion = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/grupo05", "root", "admin");
            Statement stmt = conexion.createStatement();
            String deleteSql = "DELETE FROM perros WHERE id='3'";
            stmt.executeUpdate(deleteSql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

