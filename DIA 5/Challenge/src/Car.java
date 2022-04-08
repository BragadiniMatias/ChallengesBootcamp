public class Car {
    private String matriculaCoche;
    private String marcaCoche;
    private String modeloCoche;

    public Car(String matriculaCoche, String marcaCoche, String modeloCoche) {
        this.matriculaCoche = matriculaCoche;
        this.marcaCoche = marcaCoche;
        this.modeloCoche = modeloCoche;
    }

    public String getMatriculaCoche() {
        return matriculaCoche;
    }

    public void setMatriculaCoche(String matriculaCoche) {
        this.matriculaCoche = matriculaCoche;
    }

    public String getMarcaCoche() {
        return marcaCoche;
    }

    public void setMarcaCoche(String marcaCoche) {
        this.marcaCoche = marcaCoche;
    }

    public String getModeloCoche() {
        return modeloCoche;
    }

    public void setModeloCoche(String modeloCoche) {
        this.modeloCoche = modeloCoche;
    }

    @Override
    public String toString() {
        return "Car{" +
                "matriculaCoche='" + matriculaCoche + '\'' +
                ", marcaCoche='" + marcaCoche + '\'' +
                ", modeloCoche='" + modeloCoche + '\'' +
                '}';
    }
}