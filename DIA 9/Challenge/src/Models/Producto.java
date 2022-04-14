package Models;

public class Producto {
    private static int idProducto;
    private int id;
    private String codigo;
    private double precio;
    private int stock;
    private int minStock;
    private Factura factura;

    public Producto(int id, String codigo, double precio, int stock, int minStock, Factura factura) {
        this.id = id;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.minStock = minStock;
        this.factura = factura;
    }

    public static int getIdProducto() {
        return idProducto;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getMinStock() {
        return minStock;
    }

    public void setMinStock(int minStock) {
        this.minStock = minStock;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
}
