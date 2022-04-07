public class Cliente {
    private String nombre;
    private String nroAsociado;
    private boolean tarjetaAmiga;

    public Cliente(String nombre, String nroAsociado) {
        this.nombre = nombre;
        this.nroAsociado = nroAsociado;
        this.tarjetaAmiga = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroAsociado() {
        return nroAsociado;
    }

    public void setNroAsociado(String nroAsociado) {
        this.nroAsociado = nroAsociado;
    }

    public boolean isTarjetaAmiga() {
        return tarjetaAmiga;
    }

    public void setTarjetaAmiga(boolean tarjetaAmiga) {
        this.tarjetaAmiga = tarjetaAmiga;
    }

}