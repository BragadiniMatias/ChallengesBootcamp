package DB;

import DB.Conect;
import Models.Cliente;
import Models.Producto;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBControllerProductos {
    private Conect connection;
    private Connection con;
    String sql = "";


    public DBControllerProductos() {
        connection = new Conect();
    }

    //==========INSERT=========================
    public void insert(Producto c) {
        PreparedStatement ps;

        try {
            con = connection.getConnection();
            sql = "insert into cliente(Nombre, Apellido, " +
                    "DNI, Direccion, FechaNacimiento) values(?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setDouble(1, c.getPrecio());
            ps.setInt(2, c.getStock());
            ps.setInt(3, c.getMinStock());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //===================DELETE==================
    public void delete(Cliente c) {
        PreparedStatement ps;

        try {
            con = connection.getConnection();
            sql = "DELETE FROM cliente WHERE idCliente=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, c.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    //Select
    public void select() {
        PreparedStatement ps;
        ResultSet rs = null;
        String sel = "";

        con = connection.getConnection();
        try {

            sel = "select * from cliente";
            ps = con.prepareStatement(sel);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Id: " + rs.getInt("idCliente")+ ", Nombre: " + rs.getString("Nombre") + " " + rs.getString("Apellido") +
                        ", DNI: "+rs.getString("DNI") + ", Direccion: " + rs.getString("Direccion") + " "+  "Fecha de nacimiento: " + " " + rs.getDate("FechaNacimiento")  );
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}