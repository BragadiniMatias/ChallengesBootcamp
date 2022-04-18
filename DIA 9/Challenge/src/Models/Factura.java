package Models;

import java.sql.Date;

public class Factura {
    private static int idFac;
    private int id;
    private Date fecha;
    private String detalle;
    private Vendedor vendedor;
    private Cliente cliente;


    public Factura(int id, Date fecha, String detalle, Vendedor vendedor, Cliente cliente) {
        this.fecha = fecha;
        this.detalle = detalle;
        this.vendedor = vendedor;
        this.cliente = cliente;
        idFac++;
        this.id = idFac;
    }


    public static int getIdFac() {
        return idFac;
    }

    public static void setIdFac(int idFac) {
        Factura.idFac = idFac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
