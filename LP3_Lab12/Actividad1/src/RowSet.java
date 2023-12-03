import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSet {
   public static void main(String[] args) {
       try {
           JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
           rowSet.setUrl("jdbc:mysql://localhost:3306/grupo05");
           rowSet.setUsername("root");
           rowSet.setPassword("admin");
           rowSet.setCommand("SELECT * FROM perros");
           rowSet.execute();
           while (rowSet.next()) {
               System.out.println(rowSet.getString("id") + ", " 
               + rowSet.getString("nombre") + ", " 
               + rowSet.getString("raza"));
           }
           rowSet.close();
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}