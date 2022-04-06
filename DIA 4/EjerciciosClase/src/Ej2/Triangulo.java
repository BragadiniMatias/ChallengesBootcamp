package Ej2;

public class Triangulo extends Forma {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void  calcularArea() {
        int area = (lado1 * lado2/2);
        System.out.println(area);
    }

    public void calcularPerimetro(){
        int per = lado1 + lado2 + lado3;
        System.out.println(per);
    }
}
