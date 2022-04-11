package Challenge;

public class PersonalServicio extends Empleado{
    private String seccion;

    public PersonalServicio(String nombre, String apellido, String dni, String estadoCivil, int nroDespacho, int nroIncorp, String seccion) {
        super(nombre, apellido, dni, estadoCivil, nroDespacho, nroIncorp);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) { //CAMBIO UN EMPLEADO DE SVCIO A OTRO DEPTO
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSeccion: " +seccion;
    }
}
