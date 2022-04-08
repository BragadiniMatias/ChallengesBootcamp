import java.util.ArrayList;

public class Vendedor extends Empleado implements IAddorRemove {
    private String telefonoMovil;
    private String areaVentas;
    private ArrayList<Cliente> listaClientes;
    private double porcentajeComisiones;
    private Car car;

    public Vendedor(String nombre, String apellido,
                    String dni, String direccion, double salario,
                    String telefono, Car car,
                    String telefonoMovil, String areaVentas,
                    double porcentajeComisiones) {

        super(nombre, apellido, dni, direccion, salario, telefono);
        this.car = car;
        this.telefonoMovil = telefonoMovil;
        this.areaVentas = areaVentas;
        this.porcentajeComisiones = porcentajeComisiones;
        listaClientes = new ArrayList<Cliente>();
    }

    @Override
    public void add(Object o) {
        listaClientes.add((Cliente) o);

    }

    @Override
    public void remove(Object o) {
        listaClientes.remove((Cliente) o);

    }

    public void cambiarCoche(Car c){
        this.car = c;
    }


    @Override
    public void incrementarSalario(int antiguedad) {
        setSalario(this.getSalario()*(antiguedad*0.10));
    }

    @Override
    public String toString() {
        return super.toString() + "Vendedor{" + "Auto: " + car.toString() + ", telefonoMovil='" + telefonoMovil + '\'' +
                ", areaVentas='" + areaVentas + '\'' +
                ", listaClientes=" + listaClientes +
                ", porcentajeComisiones=" + porcentajeComisiones +
                '}';
    }
}
