package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conect {
    Connection conectar = null;
    private String urlServer = "jdbc:mysql://localhost:3306/empresaproductos";
    private String userDb = "root";
    private String passDb = "0303456";

    public Conect(){
        try {
            conectar = DriverManager.getConnection(urlServer, userDb, passDb);
            System.out.println("Conectado!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return conectar;

    }
}
