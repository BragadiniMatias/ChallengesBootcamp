import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SelectClient {
    private Conection conection;
    private Connection con;
    String sqlQuery = "";


    public SelectClient(){
        conection = new Conection();
    }

    public void select() {
        PreparedStatement ps;

        try {
            Connection con = conection.getConnection();
            sqlQuery = "select * from cliente";
            ps = con.prepareStatement(sqlQuery);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
