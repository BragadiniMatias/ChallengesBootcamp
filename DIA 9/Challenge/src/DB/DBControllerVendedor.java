package DB;

import DB.Conect;
import Models.Cliente;
import Models.Vendedor;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBControllerVendedor {
    private Conect connection;
    private Connection con;
    String sql = "";


    public DBControllerVendedor(){
        connection = new Conect();
    }

    //==========INSERT=========================
    public void insert(Cliente c){
        PreparedStatement ps;

        try{
            con = connection.getConnection();
            sql = "insert into vendedor(Nombre, Apellido, " +
                    "DNI, Direccion, FechaNacimiento) values(?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,c.getNombre());
            ps.setString(2, c.getApellidos());
            ps.setString(3,c.getDNI());
            ps.setString(4, c.getDireccion());
            ps.setDate(5, c.getFechaNacimiento());
            ps.executeUpdate();

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    //===================DELETE==================
    public void delete(Vendedor c )  {
        PreparedStatement ps;

        try{
            con = connection.getConnection();
            sql = "DELETE FROM cliente WHERE idVendedor=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, c.getId());
            ps.executeUpdate();
        } catch (SQLException e ){
            System.out.println(e.getMessage());
        }

    }

    //Select
    public ResultSet select(){
        PreparedStatement ps;
        ResultSet rs = null;
        try {
            con = connection.getConnection();
            sql = "select * from cliente";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
}
