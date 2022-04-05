package Ej2;

public class Perro extends Animal implements Eat, Sleep {
    private String especie;
    private int peso;

    public Perro(String nombre, int peso, String especie, int peso1) {
        super(nombre, peso);
        this.especie = especie;
        this.peso = peso1;
    }

    @Override
    public void eat() {
        System.out.println("Dog eats dog based food");
    }

    @Override
    public void dormir() {
        System.out.println("Dog sleeps mostly during the night");
    }
}



