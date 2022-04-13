import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteClient {
    private Conection conection;
    private Connection con;
    String sqlQuery = "";

    public DeleteClient() {
        conection = new Conection();
    }

    public void delete(Cliente c ) throws SQLException {
        PreparedStatement ps;
        con = conection.getConnection();
        sqlQuery = "DELETE FROM cliente WHERE Nombre=?";
        ps = con.prepareStatement(sqlQuery);
        ps.setString(1, c.getNombre());
        ps.executeUpdate();


    }


}
