public class Empleado {
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private double aniosAntiguedad;
    private double salario;
    private String telefono;
    private Empleado empleadoSupervisor;

    public Empleado(String nombre, String apellido, String dni, String direccion, double salario, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.salario = salario;
        this.telefono = telefono;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(double aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empleado getEmpleadoSupervisor() {
        return empleadoSupervisor;
    }











    //Incrementar salario
    public void incrementarSalario(int antiguedad) {
        salario = salario + (salario) * antiguedad;
    }


    public void cambiarSupervisor(Empleado e) {
        this.empleadoSupervisor = e;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                ", aniosAntiguedad=" + aniosAntiguedad +
                ", salario=" + salario +
                ", telefono='" + telefono + '\'' +
                ", empleadoSupervisor=" + empleadoSupervisor +
                '}';
    }

}
