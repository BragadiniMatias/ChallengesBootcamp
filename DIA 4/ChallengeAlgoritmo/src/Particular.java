public class Particular extends Vehiculo{
    private int puertas;

    public Particular(String matricula,int puertas) {
        super(matricula);
        this.puertas = puertas;
    }

    public int getPuertas(){
        return this.puertas;
    }

    @Override
    public void acelerar(double velocidad) throws TooFastException {
        super.acelerar(velocidad);
    }

    @Override
    public String toString() {
        return "La matricula del particular es " + getMatricula() + " tiene " + puertas + " puertas, y su velocidad es de " + getVelocidad() +" km/hora";
    }
}
