package Challenge;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private String estadoCivil;

    public Persona(String nombre, String apellido, String dni, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
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

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) { //CAMBIO EL ESTADO CIVIL DE UNA PERSONA
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Nombre : " + nombre + "\nApellido: " + apellido + "\nDNi: " + dni + "\nEstado civil: " + estadoCivil;
    }
}
