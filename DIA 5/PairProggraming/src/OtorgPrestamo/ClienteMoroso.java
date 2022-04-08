package OtorgPrestamo;

public class ClienteMoroso implements IAnalisisCrediticio, IOtorgamientoPrestamo {
    private String nombre;
    private String apellido;
    private String deudaTotal;

    public ClienteMoroso(String nombre, String apellido, String deudaTotal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.deudaTotal = deudaTotal;
    }

    @Override
    public void analisis(String deuda) {

    }

    @Override
    public void otorgar(String nombre) {

    }
}
