public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private double montoDeuda;



    public Persona(String nombre, String apellido, String dni, double montoDeuda) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.montoDeuda = montoDeuda;
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
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setMontoDeuda(double montoDeuda) {
        this.montoDeuda = montoDeuda;
    }

    public double getMontoDeuda() {
        return montoDeuda;
    }

    public void pagar(double pago){
        montoDeuda = montoDeuda - pago;
        setMontoDeuda(montoDeuda);
    }

}
