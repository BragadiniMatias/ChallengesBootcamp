package Models;

import java.sql.Date;

public class Cliente {
    private static int idCliente;
    private int id;
    private String nombre;
    private String apellidos;
    private String DNI;
    private String direccion;
    private java.sql.Date fechaNacimiento;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String DNI, String direccion, Date
            fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        idCliente++;
        this.id = idCliente;
    }

    public static int getIdCliente() {
        return idCliente;
    }

    public static void setIdCliente(int idCliente) {
        Cliente.idCliente = idCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
