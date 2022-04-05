package Ej2;

public class Gato extends Animal implements Eat, Sleep {
    String tipo;
    String color;

    public Gato(String nombre, int peso, String tipo, String color) {
        super(nombre, peso);
        this.tipo = tipo;
        this.color = color;
    }


    @Override
    public void eat() {
        System.out.println("Cat eats cat based food");
    }

    @Override
    public void dormir() {
        System.out.println("Cat sleeps at any time");
    }
}
