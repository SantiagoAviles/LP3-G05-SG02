import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class CallableStatementApp {
    public static void main(String[] args) throws Exception {
        try {
            Connection conexion = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/grupo05", "root", "admin");
            CallableStatement cs = conexion.prepareCall("{call getPerro(?, ?, ?)}");
            String id = "1";
            cs.setString(1, id);
            cs.registerOutParameter(2, java.sql.Types.VARCHAR);
            cs.registerOutParameter(3, java.sql.Types.VARCHAR);
            cs.execute();
            String nombre = cs.getString(2);
            String raza = cs.getString(3);
            System.out.println("Nombre: " + nombre);
            System.out.println("Raza: " + raza);
            cs.close();
            conexion.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

