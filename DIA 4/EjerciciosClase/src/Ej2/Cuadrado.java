package Ej2;

public class Cuadrado extends Forma {
    private int lado1;
    private int lado2;
    private int lado3;
    private int lado4;

    public Cuadrado(int lado1, int lado2, int lado3, int lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    @Override
    public void  calcularArea() {
        int area = lado1 + lado2 + lado3 + lado4;
        System.out.println(area);
    }

    public void calcularPerimetro(){
        int perimetro = lado1*4;
        System.out.println(perimetro);
    }

}
