package ChallengeClase;

import ChallengeClase.Cliente;
import ChallengeClase.Conection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertClient {
    private Conection conection;
    private Connection con;
    String sqlQuery = "";

    public InsertClient() {
        conection = new Conection();
    }

    public void insert(Cliente c) {
        PreparedStatement ps;

        try {
            con = conection.getConnection();
            sqlQuery = "insert into cliente(idCliente, Nombre, Apellido, DNI, Direccion, FechaNacimiento) values(?,?,?,?,?,?)";
            ps = con.prepareStatement(sqlQuery);
            ps.setInt(1, c.getId());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getApellidos());
            ps.setString(4, c.getDNI());
            ps.setString(5, c.getDireccion());
            ps.setString(6, c.getFechaNacimiento());

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }



}
