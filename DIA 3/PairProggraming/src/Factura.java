import java.util.ArrayList;

public class Factura {
    private static int nroFactura = 0;
    private ArrayList<Producto> productos;
    private Cliente cliente;
    private String descripcion;
    private int numeroFactura;
    private char tipo;
    private double monto;
    private double promedioProductos;
    private double descuentoElectrodomestico;
    private double descuentoComida;
    private double montoComida;
    private double montoElectrodomestico;


    public Factura(Cliente cliente, String descripcion, char tipo) {
        this.productos = new ArrayList<Producto>();
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.numeroFactura = ++nroFactura;
        this.tipo = tipo;
        this.monto = 0;
        this.promedioProductos = 0;
        this.montoElectrodomestico = 0;
        this.montoComida = 0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public double getPromedioProductos() {
        return promedioProductos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void calcularMonto() {
        if (this.cuentaElectrodomesticos()) {
            this.montoElectrodomestico *= this.descuentoElectrodomestico;
        }
        if (this.cuentaComida()) {
            this.montoComida *= this.descuentoComida;
        }
        this.monto = this.montoComida + this.montoElectrodomestico;
        if (this.cliente.isTarjetaAmiga()) {
            this.monto *= 0.9;
        }
        if (this.tipo == 'A') {
            this.monto *= 1.21;
        }

    }

    private boolean cuentaElectrodomesticos() {
        int contador = 0;
        for (Producto p : productos) {
            if (p instanceof Electrodomestico) {
                this.montoElectrodomestico += p.getPrecio();
                contador++;
            }
        }
        if (contador >= 2) {
            this.descuentoElectrodomestico = 0.9;
            return true;
        } else {
            return false;
        }
    }

    private boolean cuentaComida() {
        int contador = 0;
        for (Producto p : productos) {
            if (p instanceof Comida) {
                this.montoComida += p.getPrecio();
                contador++;
            }
        }
        if (contador >= 5) {
            this.descuentoComida = 0.95;
            return true;
        } else {
            return false;
        }
    }

    public void promedioPrecioProdcutos() {
        double montoTotal = 0;
        int cant = 0;
        for (Producto p : productos) {
            montoTotal += ((double) p.getPrecio());
            cant++;
        }
        this.promedioProductos = montoTotal / cant;
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }
}