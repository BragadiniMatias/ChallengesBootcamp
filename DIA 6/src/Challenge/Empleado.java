package Challenge;

public abstract class Empleado extends Persona {
    private int nroDespacho;
    private int nroIncorp;

    public Empleado(String nombre, String apellido, String dni, String estadoCivil, int nroDespacho, int nroIncorp) {
        super(nombre, apellido, dni, estadoCivil);
        this.nroDespacho = nroDespacho;
        this.nroIncorp = nroIncorp;
    }

    public int getNroDespacho() {
        return nroDespacho;
    }

    public void setNroDespacho(int nroDespacho) { //REASIGNACION DESPACHO A UN EMPLEADO
        this.nroDespacho = nroDespacho;
    }

    public int getNroIncorp() {
        return nroIncorp;
    }

    public void setNroIncorp(int nroIncorp) {
        this.nroIncorp = nroIncorp;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero de despacho: " + nroDespacho + "\nAnio de incorporacion: " + nroIncorp;
    }
}
