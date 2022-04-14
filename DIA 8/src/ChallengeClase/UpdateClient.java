package ChallengeClase;

import ChallengeClase.Cliente;
import ChallengeClase.Conection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateClient {
    private Conection conection;
    private Connection con;
    String sqlQuery = "";

    public UpdateClient(){
        conection = new Conection();
    }

    public void UpdateClient(Cliente c){
        PreparedStatement ps;

        try {
            con = conection.getConnection();
            sqlQuery = "UPDATE cliente SET Nombre=?, Apellido=?, DNI=?, Direcion=?, FechaNacimiento=?, where idCliente=?";
            ps = con.prepareStatement(sqlQuery);
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getApellidos());
            ps.setString(3, c.getDNI());
            ps.setString(4, c.getDireccion());
            ps.setString(5, c.getFechaNacimiento());
            ps.setInt(6,1);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
