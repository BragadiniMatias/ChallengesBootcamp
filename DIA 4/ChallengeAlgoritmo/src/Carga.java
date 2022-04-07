public class Carga extends Vehiculo{
    private Remolque rem = null;

    public Carga(String matricula) {
        super(matricula);
    }

    public void ponRemolque(Remolque r){
        this.rem = r;
    }

    public void quitaRemolque(){
        this.rem = null;
    }

    @Override
    public void acelerar(double velocidad) throws TooFastException {
        if (getVelocidad() + velocidad > 100 && (rem != null)) {
            throw new TooFastException();
        }
        super.acelerar(velocidad);
    }

    @Override
    public String toString() {
        return "El camion lleva un remolque que pesa " + rem.getPeso() + " kg, su matricula es  " + this.getMatricula() + " y su velocidad es " + this.getVelocidad() ;
    }
}
