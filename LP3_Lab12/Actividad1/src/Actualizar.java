import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Actualizar {
    public static void main(String[] args) throws Exception {
        try {
            Connection conexion = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/grupo05", "root", "admin");
            Statement stmt = conexion.createStatement();
            String updateSql = "UPDATE perros SET nombre='Tomás' WHERE id='6'";
            stmt.executeUpdate(updateSql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

