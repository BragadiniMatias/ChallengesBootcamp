import java.sql.*;


public class Conection {
    Connection conectar = null;
    private String urlServer = "jdbc:mysql://localhost:3306/dia8";
    private String userDb = "root";
    private String passDb = "0303456";

    public Conection(){
        try {
            conectar = DriverManager.getConnection(urlServer, userDb, passDb);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return conectar;

    }


}
