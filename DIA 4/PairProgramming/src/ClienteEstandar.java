public class ClienteEstandar extends Persona{
    private boolean turno;

    public ClienteEstandar(String nombre, String apellido, String dni, double montoDeuda, boolean turno) {
        super(nombre, apellido, dni, montoDeuda);
        this.turno = turno;
    }


    public void sacarTurno(){
        this.turno = true;
    }


    @Override
    public void pagar(double pago) {
        if (turno) {
            super.pagar(pago);
        } else{
            System.out.println("El cliente no tiene un turno asignado.");
        }


    }
}
