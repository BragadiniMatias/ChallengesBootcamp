package Challenge;

public class Profesor extends Empleado{
    private String departamento;

    public Profesor(String nombre, String apellido, String dni, String estadoCivil, int nroDespacho, int nroIncorp, String departamento) {
        super(nombre, apellido, dni, estadoCivil, nroDespacho, nroIncorp);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) { //CAMBIO DEPTO DE UN PROFESOR
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartamento: " + departamento;
    }
}
