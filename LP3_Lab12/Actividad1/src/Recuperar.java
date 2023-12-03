import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Recuperar {
    public static void main(String[] args) throws Exception {
        try {
            Connection conexion = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/grupo05", "root", "admin");
            String selectSql = "SELECT * FROM perros";
            Statement stmt = conexion.createStatement();
            ResultSet resultSet = stmt.executeQuery(selectSql);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("id") + ", " 
                + resultSet.getString("nombre") + ", "
                + resultSet.getString("raza"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
