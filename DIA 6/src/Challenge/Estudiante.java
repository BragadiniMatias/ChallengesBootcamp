package Challenge;

public class Estudiante extends Persona{
    private String curso;

    public Estudiante(String nombre, String apellido, String dni, String estadoCivil, String curso) {
        super(nombre, apellido, dni, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) { //MATRICULACION A UN NUEVO CURSO
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCurso: " + curso;
    }
}
