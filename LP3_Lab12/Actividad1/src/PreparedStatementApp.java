import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementApp {
    public static void main(String[] args) throws Exception {
        try {
            Connection conexion = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/grupo05", "root", "admin");
            PreparedStatement pstmt = conexion.prepareStatement("INSERT INTO perros(id, nombre, raza) VALUES(?, ?, ?)");
            pstmt.setString(1, "7");
            pstmt.setString(2, "Joshua");
            pstmt.setString(3, "Schnauzer");
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

