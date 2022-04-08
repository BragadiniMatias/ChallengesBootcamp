package OtorgPrestamo;

public class ClienteExcelente implements IOtorgamientoPrestamo {
    private String nombre;
    private String apellido;

    public ClienteExcelente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public void otorgar(String nombre) {

    }
}
