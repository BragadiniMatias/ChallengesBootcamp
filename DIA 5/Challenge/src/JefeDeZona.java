import java.util.ArrayList;

public class JefeDeZona extends Empleado implements IAddorRemove {
    private int nroDespacho;
    private Secretario secretarioACargo;
    private ArrayList<Vendedor> vendedoresZonal;
    private Car car;


    public JefeDeZona(String nombre, String apellido,
                      String dni, String direccion,
                      double salario, String telefono,
                      int nroDespacho, Secretario secretarioACargo, Car car) {
        super(nombre, apellido, dni, direccion, salario, telefono);
        this.nroDespacho = nroDespacho;
        this.secretarioACargo = secretarioACargo;
        vendedoresZonal = new ArrayList<Vendedor>();
        this.car = car;
    }

    public int getNroDespacho() {
        return nroDespacho;
    }

    public void setNroDespacho(int nroDespacho) {
        this.nroDespacho = nroDespacho;
    }

    public Secretario getSecretarioACargo() {
        return secretarioACargo;
    }

    public void setSecretarioACargo(Secretario secretarioACargo) {
        this.secretarioACargo = secretarioACargo;
    }

    public ArrayList<Vendedor> getVendedoresZonal() {
        return vendedoresZonal;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


    @Override
    public void incrementarSalario(int antiguedad) {
        setSalario(this.getSalario()*(antiguedad*0.20));
    }


    @Override
    public void add(Object o) {
        vendedoresZonal.add((Vendedor) o);
    }

    @Override
    public void remove(Object o) {
        vendedoresZonal.remove((Vendedor) o);

    }


    public void cambiarCoche(Car c){
        this.car = c;
    }


    @Override
    public String toString() {
        return super.toString() +  "JefeDeZona{" +
                "nroDespacho=" + nroDespacho +
                ", secretarioACargo=" + secretarioACargo +
                ", matriculaCoche='" +
                ", vendedoresZonal=" + vendedoresZonal.toString() +
                '}';
    }
}
