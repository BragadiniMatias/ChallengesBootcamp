package Models;

import java.sql.Date;

public class Vendedor {
    private static int idV;
    private int id;
    private String nombre;
    private String apellido;
    private String Dni;
    private String direccion;
    private String salario;
    private Date date;


    public Vendedor(int id, String nombre, String apellido, String dni, String direccion, String salario, Date date) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        Dni = dni;
        this.direccion = direccion;
        this.salario = salario;
        this.date = date;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
