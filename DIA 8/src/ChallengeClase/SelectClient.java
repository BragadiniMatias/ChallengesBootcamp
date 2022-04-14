package ChallengeClase;

import ChallengeClase.Conection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectClient {
    private Conection conection;
    private Connection con;
    String sqlQuery = "";


    public SelectClient(){
        conection = new Conection();
    }

    public ResultSet select() {
        PreparedStatement ps;
        ResultSet rs = null;
        try {
            Connection con = conection.getConnection();
            sqlQuery = "select * from cliente";
            ps = con.prepareStatement(sqlQuery);
            rs = ps.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
}
