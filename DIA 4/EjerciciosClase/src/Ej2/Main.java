package Ej2;

public class Main {
    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado(10,20,30,40);
        c1.calcularArea();
        c1.calcularPerimetro();

        Triangulo t1 = new Triangulo(10,20,30);
        t1.calcularArea();
        t1.calcularPerimetro();
    }
}
