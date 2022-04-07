public class ClientePremium extends Persona {
    private int antiguedad;

    public ClientePremium(String nombre, String apellido, String dni, double montoDeuda, int antiguedad) {
        super(nombre, apellido, dni, montoDeuda);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double calcularDto(int antiguedad){
        if(antiguedad<10){
            return 0.95;
        } else if (antiguedad>10 && antiguedad<20){
            return 0.90;
        } else return 0.85;
    }

    @Override
    public void pagar(double pago) {
        setMontoDeuda(getMontoDeuda()*calcularDto(getAntiguedad()) - pago);
    }
}
