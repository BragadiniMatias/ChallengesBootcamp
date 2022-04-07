public class Vehiculo {
    private String matricula;
    private double velocidad;

    public Vehiculo() {
    }

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public void acelerar(double velocidad) throws TooFastException {
        this.velocidad += velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setVelocidad(double velocidad){
        this.velocidad = velocidad;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public double getVelocidad() {
        return velocidad;
    }


    @Override
    public String toString() {
        return "La matricula del vehiculo es " + this.matricula + " y su velocidad es de " + this.velocidad +" km/hora";
    }
}

