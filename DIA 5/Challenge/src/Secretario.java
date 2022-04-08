public class Secretario extends Empleado{
    private int despacho;
    private String nroFax;


    public Secretario(String nombre, String apellido, String dni, String direccion, double salario, String telefono, int despacho, String nroFax) {
        super(nombre, apellido, dni, direccion, salario, telefono);
        this.despacho = despacho;
        this.nroFax = nroFax;
    }

    @Override
    public void incrementarSalario(int antiguedad) {
        setSalario(getSalario()*(antiguedad*0.05));
    }

    @Override
    public String toString() {
        return super.toString() +
                "Numero de despacho :"+  this.despacho + "\nNumero de fax: " + this.nroFax;
    }
}
